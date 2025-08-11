package mydaos;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import mypojos.Item;
import util.ItemsHibernateUtil;

public class ItemDao {
    public void saveItem(Item item) {
        Transaction transaction = null;
        try (Session session = ItemsHibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(item);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void updateItem(Item item) {
        Transaction transaction = null;
        try (Session session = ItemsHibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(item);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void deleteItem(int id) {
        Transaction transaction = null;
        try (Session session = ItemsHibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Item item = session.get(Item.class, id);
            if (item != null) {
                session.delete(item);
            }
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Item getItemById(int id) {
        try (Session session = ItemsHibernateUtil.getSessionFactory().openSession()) {
            return session.get(Item.class, id);
        }
    }

    @SuppressWarnings("unchecked")
    public List<Item> getAllItems() {
        try (Session session = ItemsHibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Item").list();
        }
    }
}