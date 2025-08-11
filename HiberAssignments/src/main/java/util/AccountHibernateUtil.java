package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AccountHibernateUtil {
    private static SessionFactory factory;

    static {
        try {
            factory = new Configuration().configure("Account.cfg.xml").buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return factory;
    }
}
