package database;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Létrehozzuk a kapcsolatot az adatbázissal.
 */

public class EmfGetter {

    private EmfGetter(){}

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("UsersDB");

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    public static void closeEmf(){
        emf.close();
    }

    public static void asd(){
        emf.isOpen();
    }
}


