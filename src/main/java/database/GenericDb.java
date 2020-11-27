package database;

import org.tinylog.Logger;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

public abstract class GenericDb<T> {

    private final Class<T> entityClass;

    public GenericDb(){
        this.entityClass = ((Class) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0]);
    }
    public void createNew(T entity){
        EntityManager em = EmfGetter.getEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(entity);
            em.getTransaction().commit();
            Logger.trace("Új entitás feltöltése sikeres");
        }catch (Exception e){
            Logger.error("Hiba történt új entitás feltöltése közben {}", e.toString());
        }finally {
            em.close();
        }
    }

    public boolean simpleDelete(T entity){
        EntityManager em = EmfGetter.getEntityManager();
        try{
            em.getTransaction().begin();
            em.remove(em.contains(entity) ? entity : em.merge(entity));
            em.getTransaction().commit();
            Logger.trace("A szimpla törlés sikeresen megtörtént.");
            return true;
        }catch (Exception e){
            Logger.error("Hiba történt az entitás törlése közben: {}", e.toString());
            return false;
        }finally {
            em.close();
        }
    }

    public void commitChange(T entity){
        EntityManager em = EmfGetter.getEntityManager();
        try{
            em.getTransaction().begin();
            em.merge(entity);
            em.getTransaction().commit();
            Logger.trace("A frissítás sikeresen megtörtént.");
        }catch (Exception e){
            Logger.error("Hiba történt az entitás frissítése közben: {}", e.toString());
        }finally {
            em.close();
        }
    }

    public List<T> findAll(){
        EntityManager em = EmfGetter.getEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<T> cq = cb.createQuery(entityClass);

        Root<T> from = cq.from(entityClass);

        cq.select(from);

        try{
            Query q = em.createQuery(cq);
            return q.getResultList();
        }catch (Exception e){
            Logger.error("Hiba minden megtalálás közben.");
        }finally {
            em.close();
        }
        return new ArrayList<T>();
    }
}
