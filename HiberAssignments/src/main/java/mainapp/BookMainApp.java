package mainapp;

import java.util.Scanner;

import mydaos.BookAuthorDAO;
import mypojos.Author;
import mypojos.Book;

public class BookMainApp {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        BookAuthorDAO dao = new BookAuthorDAO();

	        System.out.println("1. Add Book with Authors");
	        System.out.println("2. View All Books");
	        int choice = sc.nextInt();
	        sc.nextLine();

	        switch (choice) {
	            case 1:
	                System.out.print("Enter Book Title: ");
	                String title = sc.nextLine();
	                Book book = new Book(title);

	                System.out.print("How many authors? ");
	                int n = sc.nextInt();
	                sc.nextLine();

	                for (int i = 0; i < n; i++) {
	                    System.out.print("Enter Author Name: ");
	                    String name = sc.nextLine();
	                    Author author = new Author(name);
	                    book.addAuthor(author);
	                }

	                dao.addBookWithAuthors(book);
	                System.out.println("Book and authors saved!");
	                break;

	            case 2:
	                dao.viewBooks();
	                break;
	        }
	        sc.close();
	    }
	}


/*
mysql> use BookAuthor;
Database changed
mysql> show tables;
Empty set (0.02 sec)

mysql> show tables;
+----------------------+
| Tables_in_bookauthor |
+----------------------+
| author               |
| book                 |
| book_author          |
+----------------------+
3 rows in set (0.01 sec)

mysql> select * from author;
+----+------------+
| id | name       |
+----+------------+
|  1 | jawaharlal |
+----+------------+
1 row in set (0.00 sec)

mysql> select * from book;
+----+-------+
| id | title |
+----+-------+
|  1 | moral |
+----+-------+
1 row in set (0.00 sec)

mysql> select * from book_author;
+---------+-----------+
| book_id | author_id |
+---------+-----------+
|       1 |         1 |
+---------+-----------+
1 row in set (0.00 sec)

mysql> select * from book;
+----+------------------+
| id | title            |
+----+------------------+
|  1 | moral            |
|  2 | The Night Dreams |
+----+------------------+
2 rows in set (0.00 sec)

mysql> select * from author;
+----+------------+
| id | name       |
+----+------------+
|  1 | jawaharlal |
|  2 | Cathode    |
|  3 | Bhuwan     |
+----+------------+
3 rows in set (0.00 sec)

mysql> select * from book_author;
+---------+-----------+
| book_id | author_id |
+---------+-----------+
|       1 |         1 |
|       2 |         2 |
|       2 |         3 |
+---------+-----------+
3 rows in set (0.00 sec)

mysql>
*/