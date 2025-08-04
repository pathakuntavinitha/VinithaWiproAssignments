package mydaofiles;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import mypojos.Product;
import mypojos.Student_123;

public class ProductDAO {
	private SessionFactory factory;


	public ProductDAO() {
    factory = new Configuration().configure("Product.cfg.xml").buildSessionFactory();
    
}
	public void addItem(Product productname)
	{
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(productname);
		tx.commit();
	}
	@SuppressWarnings("unchecked")
	public List<Product> getAllItems()
	{
		Session session=factory.openSession();
		List<Product> items = session.createQuery("from Product").list(); 
        session.close();
        return items;
		
	}
	public Product  getItembyid(int id)
	{
		Session session=factory.openSession();
		return session.get(Product.class,id);
		
	}
	public boolean UpdateItem(Product productname)
	{
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.update(productname);
		tx.commit();
		session.close();
		return true;
	}
	public boolean deleteItem(int id)
	{
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Product item=session.get(Product.class,id);
		if(item!=null)
			session.delete(item);
		tx.commit();
		return true;
	}
	
}

