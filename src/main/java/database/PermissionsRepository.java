package database;

import model.Permissions;
import org.tinylog.Logger;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class PermissionsRepository extends GenericDb<Permissions> {

    public Permissions findByUsername(String name){
        EntityManager em = EmfGetter.getEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<Permissions> cq = cb.createQuery(Permissions.class);

        Root<Permissions> from = cq.from(Permissions.class);

        cq.select(from).where(cb.like(from.get("username"),name));

        try{
            Query q = em.createQuery(cq);
            return (Permissions) q.getResultList().get(0);
        }catch (Exception e){
            Logger.error("Hiba a modell megtalálása közben.");
        }finally {
            em.close();
        }
        return null;
    }
}
