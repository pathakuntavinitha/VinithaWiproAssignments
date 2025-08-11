package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ItemsHibernateUtil {
    private static SessionFactory factory;

    static {
        try {
            factory = new Configuration().configure("items.cfg.xml").buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return factory;
    }
    public static void shutdown() {
        getSessionFactory().close();
    }
}
