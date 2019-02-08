package fr.project_j2ee.dao;

import fr.project_j2ee.dao.jpa.JpaCategoryDao;
import fr.project_j2ee.dao.jpa.JpaPicturesDao;
import fr.project_j2ee.dao.jpa.JpaUsersDao;
import fr.project_j2ee.util.PersistenceManager;

public class DaoFactory {

    private DaoFactory() {
        // Util class.
    }

    public static DaoCategory getDaoCategory() {
        return new JpaCategoryDao(PersistenceManager.getEntityManagerFactory());
    }

    public static DaoUsers getDaoUsers() {
        return new JpaUsersDao(PersistenceManager.getEntityManagerFactory());
    }
    
    public static DaoPictures getDaoPictures() {
        return new JpaPicturesDao(PersistenceManager.getEntityManagerFactory());
    }
}
