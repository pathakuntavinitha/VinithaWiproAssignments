package mainapp;

import java.util.List;
import java.util.Scanner;
import util.ItemsHibernateUtil;
import mydaos.ItemDao;
import mypojos.Item;

public class Itemmain {
    private static ItemDao itemDao = new ItemDao();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        
        while (running) {
            System.out.println("\nHIBERNATE:");
            System.out.println("1. Add");
            System.out.println("2. View All");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Get by ID");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) {
                case 1:
                    addItem();
                    break;
                case 2:
                    viewAllItems();
                    break;
                case 3:
                    updateItem();
                    break;
                case 4:
                    deleteItem();
                    break;
                case 5:
                    getItemById();
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
        
        ItemsHibernateUtil.shutdown();
        System.out.println("Application exit");
    }

    private static void addItem() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); 
        
        Item item = new Item(name, price);
        itemDao.saveItem(item);
        System.out.println("Item added");
    }

    private static void viewAllItems() {
        List<Item> items = itemDao.getAllItems();
        if (items.isEmpty()) {
            System.out.println("No items found");
        } else {
            System.out.println("Items:");
            for (Item item : items) {
                System.out.println(item);
            }
        }
    }

    private static void updateItem() {
        System.out.print("Enter item ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        
        Item item = itemDao.getItemById(id);
        if (item == null) {
            System.out.println("Item not found");
            return;
        }
        
        System.out.print("Enter new name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter new price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); 
        item.setName(name);
        item.setPrice(price);
        itemDao.updateItem(item);
        System.out.println("Item updated");
    }

    private static void deleteItem() {
        System.out.print("Enter item ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        
        Item item = itemDao.getItemById(id);
        if (item == null) {
            System.out.println("Item not found");
            return;
        }
        
        itemDao.deleteItem(id);
        System.out.println("Item deleted");
    }

    private static void getItemById() {
        System.out.print("Enter item ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        
        Item item = itemDao.getItemById(id);
        if (item == null) {
            System.out.println("Item not found");
        } else {
            System.out.println("Item details: " + item);
        }
    }
}
/*
 * 
HIBERNATE:
1. Add
2. View All
3. Update
4. Delete
5. Get by ID
0. Exit
Choose option: 1
Enter name: pen
Enter price: 15.5
Hibernate: insert into items (name, price) values (?, ?)
Item added

HIBERNATE:
1. Add
2. View All
3. Update
4. Delete
5. Get by ID
0. Exit
Choose option: 1
Enter name: pencil
Enter price: 5.5
Hibernate: insert into items (name, price) values (?, ?)
Item added

HIBERNATE:
1. Add
2. View All
3. Update
4. Delete
5. Get by ID
0. Exit
Choose option: 2
Hibernate: select item0_.id as id1_0_, item0_.name as name2_0_, item0_.price as price3_0_ from items item0_
Items:
Item [id=1, name=pen, price=15.5]
Item [id=2, name=pencil, price=5.5]

HIBERNATE:
1. Add
2. View All
3. Update
4. Delete
5. Get by ID
0. Exit
Choose option: 3
Enter item ID to update: 2
Hibernate: select item0_.id as id1_0_0_, item0_.name as name2_0_0_, item0_.price as price3_0_0_ from items item0_ where item0_.id=?
Enter new name: Eraser
Enter new price: 5
Hibernate: update items set name=?, price=? where id=?
Item updated

HIBERNATE:
1. Add
2. View All
3. Update
4. Delete
5. Get by ID
0. Exit
Choose option: 2
Hibernate: select item0_.id as id1_0_, item0_.name as name2_0_, item0_.price as price3_0_ from items item0_
Items:
Item [id=1, name=pen, price=15.5]
Item [id=2, name=Eraser, price=5.0]

HIBERNATE:
1. Add
2. View All
3. Update
4. Delete
5. Get by ID
0. Exit
Choose option: 5
Enter item ID: 2
Hibernate: select item0_.id as id1_0_0_, item0_.name as name2_0_0_, item0_.price as price3_0_0_ from items item0_ where item0_.id=?
Item details: Item [id=2, name=Eraser, price=5.0]

HIBERNATE:
1. Add
2. View All
3. Update
4. Delete
5. Get by ID
0. Exit
Choose option: 1
Enter name: Pencil
Enter price: 15
Hibernate: insert into items (name, price) values (?, ?)
Item added

HIBERNATE:
1. Add
2. View All
3. Update
4. Delete
5. Get by ID
0. Exit
Choose option: 4
Enter item ID to delete: 3
Hibernate: select item0_.id as id1_0_0_, item0_.name as name2_0_0_, item0_.price as price3_0_0_ from items item0_ where item0_.id=?
Hibernate: select item0_.id as id1_0_0_, item0_.name as name2_0_0_, item0_.price as price3_0_0_ from items item0_ where item0_.id=?
Hibernate: delete from items where id=?
Item deleted

HIBERNATE:
1. Add
2. View All
3. Update
4. Delete
5. Get by ID
0. Exit
Choose option: 0

INFO: HHH10001008: Cleaning up connection pool [jdbc:mysql://localhost:3306/ItemsHiber]
Application exit



mysql> create database Itemshiber;
Query OK, 1 row affected (0.10 sec)

mysql> use Itemshiber;
Database changed
mysql> show tables;
+----------------------+
| Tables_in_itemshiber |
+----------------------+
| items                |
+----------------------+
1 row in set (0.01 sec)

mysql> select * from items;
+----+--------+-------+
| id | name   | price |
+----+--------+-------+
|  1 | pen    |  15.5 |
|  2 | pencil |   5.5 |
+----+--------+-------+
2 rows in set (0.00 sec)

mysql> select * from items;
+----+--------+-------+
| id | name   | price |
+----+--------+-------+
|  1 | pen    |  15.5 |
|  2 | Eraser |     5 |
+----+--------+-------+
2 rows in set (0.00 sec)

mysql> select * from items;
+----+--------+-------+
| id | name   | price |
+----+--------+-------+
|  1 | pen    |  15.5 |
|  2 | Eraser |     5 |
|  3 | Pencil |    15 |
+----+--------+-------+
3 rows in set (0.00 sec)

mysql> select * from items;
+----+--------+-------+
| id | name   | price |
+----+--------+-------+
|  1 | pen    |  15.5 |
|  2 | Eraser |     5 |
+----+--------+-------+
2 rows in set (0.00 sec)
*/
