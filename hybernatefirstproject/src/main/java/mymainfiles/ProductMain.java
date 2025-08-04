package mymainfiles;

import java.util.List;
import java.util.Scanner;

import mydaofiles.ProductDAO;
import mypojos.Product;
import mypojos.Student_123;


public class ProductMain {


public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ProductDAO dao=new ProductDAO();
		while(true)
		{
			
            System.out.println("Hibernate Item CRUD");
            System.out.println("1. Add Item");
            System.out.println("2. View All");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Get by ID");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");
            int op=sc.nextInt();
            switch(op)
            {
            case 1:
	            sc.nextLine(); 
	            System.out.print("Enter name: ");
	            String name = sc.nextLine();
	            System.out.print("Enter price: ");
	            float price = sc.nextFloat();
	            dao.addItem(new Product(name, price));
	            System.out.println("Item added.");
	            break;
            case 2:
                List<Product> items = dao.getAllItems();
                for (Product s : items) {
                    System.out.println(s.getProductname() + " | " + s.getPrice());
                }
                break;
            case 3:
            	 System.out.print("Enter ID to Update:");
                 int id = sc.nextInt();
            	Product itemToUpdate = dao.getItembyid(id);
            	if (itemToUpdate != null) {
            	    sc.nextLine(); 
            	    System.out.print("Enter new name: ");
            	    itemToUpdate.setProductname(sc.nextLine());
            	    System.out.print("Enter new price: ");
            	    itemToUpdate.setPrice(sc.nextFloat());
            	    
            	    boolean updated = dao.UpdateItem(itemToUpdate);
            	    if (updated) {
            	        System.out.println("Item updated successfully.");
            	    } else {
            	        System.out.println("Update failed.");
            	    }
            	} else {
            	    System.out.println("Item with ID " + id + " not found.");
            	}
            	break;
            case 4:
                System.out.print("Enter ID to delete:");
                int idToDelete = sc.nextInt();
        
                boolean deleted = dao.deleteItem(idToDelete);
                if (deleted) {
                    System.out.println("Student deleted successfully.");
                } else {
                    System.out.println("Student with ID " + idToDelete + " not found.");
                }
                break;
           
            case 5:
                System.out.print("Enter ID to fetch: ");
                int id1 = sc.nextInt();
                Product item = dao.getItembyid(id1);
                if (item != null)
                    System.out.println(item);
                else
                    System.out.println("Item not found.");
                break;
            case 0:
                System.out.println("Exiting...");
                sc.close();
                System.exit(0);
            default:
                System.out.println("Invalid choice.");
	            
            
            }
		}
	}
}
/*Hibernate Item CRUD
1. Add Item
2. View All
3. Update
4. Delete
5. Get by ID
0. Exit
Choose option: 1
Enter name: vinitha
Enter price: 45
Hibernate: insert into product (price, productname) values (?, ?)
Item added.
Hibernate Item CRUD
1. Add Item
2. View All
3. Update
4. Delete
5. Get by ID
0. Exit
Choose option: 2
Hibernate: select product0_.id as id1_0_, product0_.price as price2_0_, product0_.productname as productn3_0_ from product product0_
Product [id=1, productname=pen, price=84.98]
Product [id=2, productname=tret, price=435.0]
Product [id=3, productname=fdgfd, price=45.0]
Product [id=4, productname=vini, price=45465.0]
Product [id=5, productname=pen, price=45.0]
Product [id=6, productname=yrt, price=56.0]
Product [id=7, productname=pen, price=67.0]
Product [id=8, productname=vinitha, price=45.0]
Hibernate Item CRUD
1. Add Item
2. View All
3. Update
4. Delete
5. Get by ID
0. Exit
Choose option: 3
Enter ID to Update:3
Hibernate: select product0_.id as id1_0_0_, product0_.price as price2_0_0_, product0_.productname as productn3_0_0_ from product product0_ where product0_.id=?
Enter new name: pencil
Enter new price: 5
Hibernate: update product set price=?, productname=? where id=?
Item updated successfully.
Enter ID to delete:8
Hibernate: select product0_.id as id1_0_0_, product0_.price as price2_0_0_, product0_.productname as productn3_0_0_ from product product0_ where product0_.id=?
Hibernate: delete from product where id=?
Student deleted successfully.
Hibernate Item CRUD
1. Add Item
2. View All
3. Update
4. Delete
5. Get by ID
0. Exit
Choose option: 5
Enter ID to fetch: 8
Hibernate: select product0_.id as id1_0_0_, product0_.price as price2_0_0_, product0_.productname as productn3_0_0_ from product product0_ where product0_.id=?
Item not found.
Hibernate Item CRUD
1. Add Item
2. View All
3. Update
4. Delete
5. Get by ID
0. Exit
Choose option: 0
Exiting...

 * 
 */
