package mydaos;


import mypojos.Book;
import util.BookHibernateUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class BookAuthorDAO {
    public void addBookWithAuthors(Book book) {
        Session session = BookHibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        session.save(book); 

        tx.commit();
        session.close();
    }

    public void viewBooks() {
        Session session = BookHibernateUtil.getSessionFactory().openSession();
        session.createQuery("FROM Book", Book.class)
                .getResultList()
                .forEach(book -> {
                    System.out.println("Book: " + book.getTitle());
                    book.getAuthors().forEach(a -> System.out.println("   Author: " + a.getName()));
                });
        session.close();
    }
}
