package fr.project_j2ee.listener;

import fr.project_j2ee.util.PersistenceManager;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class PersistenceAppListener implements ServletContextListener{
	@Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        PersistenceManager.closeEntityManagerFactory();
    }
}