package database;

import org.tinylog.Logger;

import javax.persistence.EntityManager;
import java.lang.reflect.ParameterizedType;

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
}
