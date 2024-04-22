package com.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

// Utility Class
public class HibernateUtil {
    public static SessionFactory obtainSessionFactory() {
        try {
            // Create a Configuration instance
            Configuration config = new Configuration().configure();

            // Build the StandardServiceRegistry
            ServiceRegistry registry = new StandardServiceRegistryBuilder()
                    .applySettings(config.getProperties()).build();

            // Build the SessionFactory
            SessionFactory factory = config.buildSessionFactory(registry);

            return factory;
        } catch (Throwable ex) {
            // Handle exception appropriately (e.g., logging, displaying error message)
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
}
