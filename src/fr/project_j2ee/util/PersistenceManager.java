package fr.project_j2ee.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceManager {
    private static EntityManagerFactory emf;

    private PersistenceManager() {
        // Util class.
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("project-j2ePU");
        }
        return emf;
    }

    public static void closeEntityManagerFactory() {
        if (emf != null && emf.isOpen()) emf.close();
    }
}
