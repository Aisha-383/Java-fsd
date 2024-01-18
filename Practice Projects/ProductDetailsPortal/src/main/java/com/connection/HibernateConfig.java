package com.connection;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import java.util.Properties;

public class HibernateConfig {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            Configuration configuration = new Configuration();
            Properties properties = new Properties();

            properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
            properties.put(Environment.URL, "jdbc:mysql://127.0.0.1:3306/shirts_db");
            properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
            properties.put(Environment.USER, "root");
            properties.put(Environment.PASS, "root");
            properties.put(Environment.HBM2DDL_AUTO, "update");
            properties.put(Environment.SHOW_SQL, true);

            // Add more properties as needed

            configuration.setProperties(properties);
            configuration.addAnnotatedClass(com.entity.Product.class);

            return configuration.buildSessionFactory();
        } catch (Exception e) {
            System.err.println("Initial SessionFactory creation failed." + e);
            throw new ExceptionInInitializerError(e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        getSessionFactory().close();
    }
}
