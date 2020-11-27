package database;

import model.Employee;
import model.Guest;
import org.tinylog.Logger;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class GuestRepository extends GenericDb<Guest> {

    public List<Guest> findByColumn(String selectedColumn, String entity) {
        EntityManager em = EmfGetter.getEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<Guest> cq = cb.createQuery(Guest.class);
        Root<Guest> from = cq.from(Guest.class);
        if(entity.isEmpty()){
            cq.select(from);
        } else {
            if (selectedColumn.equals("payment") || selectedColumn.equals("phone_number"))  {
                Integer number = Integer.parseInt(entity);
                cq.select(from).where(cb.equal(from.get(selectedColumn), number));
            }  else if (selectedColumn.equals("occupying_the_room") || selectedColumn.equals("leaving_the_room")) {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
                LocalTime time = LocalTime.parse(entity, dtf);
                cq.select(from).where(cb.equal(from.get(selectedColumn), time));
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
