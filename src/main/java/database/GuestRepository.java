package database;

import model.Guest;
import net.bytebuddy.asm.Advice;
import org.tinylog.Logger;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GuestRepository extends GenericDb<Guest> {

    public List<Guest> findByColumn(String selectedColumn, String entity) throws ParseException {
        EntityManager em = EmfGetter.getEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<Guest> cq = cb.createQuery(Guest.class);
        Root<Guest> from = cq.from(Guest.class);
        if(entity.isEmpty()){
            cq.select(from);
        } else {
            if (selectedColumn.equals("payment") || selectedColumn.equals("phone_number") || selectedColumn.equals("id"))  {
                Integer number = Integer.parseInt(entity);
                cq.select(from).where(cb.equal(from.get(selectedColumn), number));
            }  else if (selectedColumn.equals("occupying_the_room") || selectedColumn.equals("leaving_the_room")) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDate localDate = LocalDate.parse(entity, formatter);

                cq.select(from).where(cb.equal(from.<Date>get(selectedColumn), localDate));
            }else {
                cq.select(from).where(cb.like(from.get(selectedColumn), "%" + entity + "%"));
            }
        }
        try {
            Query q = em.createQuery(cq);
            Logger.info("Select completed successful");
            return q.getResultList();
        } catch (Exception e) {
            Logger.error("Select failed");
        } finally {
            em.close();
        }
        return new ArrayList<>();
    }
}
