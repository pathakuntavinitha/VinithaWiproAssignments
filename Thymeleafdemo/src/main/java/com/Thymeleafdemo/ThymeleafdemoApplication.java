package com.Thymeleafdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThymeleafdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafdemoApplication.class, args);
	}

}
/*http://localhost:8088/
 *
 * mysql> use UserClient;
Database changed
mysql> show tables;
+----------------------+
| Tables_in_userclient |
+----------------------+
| client               |
+----------------------+
1 row in set (0.03 sec)

mysql> select * from client;
+----+-------------------+-------------------------+----------------+----------------+
| id | address           | email                   | name           | phone          |
+----+-------------------+-------------------------+----------------+----------------+
|  5 | New York City,USA | bill.grant@gmail.com    | Bill Grant     | 1-254-356-3311 |
|  6 | NewYork,UsA       | lillian.lewis@gmail.com | Lillian Lewis  | 1-441-498-4523 |
+----+-------------------+-------------------------+----------------+----------------+
2 rows in set (0.00 sec)

mysql> select * from client;
+----+-------------------+-------------------------+----------------+----------------+
| id | address           | email                   | name           | phone          |
+----+-------------------+-------------------------+----------------+----------------+
|  5 | New York City,USA | bill.grant@gmail.com    | Bill Grant     | 1-254-356-3311 |
|  6 | NewYork,UsA       | lillian.lewis@gmail.com | Lillian Lewis  | 1-441-498-4523 |
|  7 | Florida           | harry@gmail.com         | Harry          | 1-566-905      |
+----+-------------------+-------------------------+----------------+----------------+
3 rows in set (0.00 sec)

mysql> select * from client;
+----+-------------------+-------------------------+----------------+----------------+
| id | address           | email                   | name           | phone          |
+----+-------------------+-------------------------+----------------+----------------+
|  5 | New York City,USA | bill.grant@gmail.com    | Bill Grant     | 1-254-356-3311 |
|  6 | NewYork,UsA       | lillian.lewis@gmail.com | Lillian Lewis  | 1-441-498-4523 |
|  7 | Florida,USA       | harry.russell@gmail.com | Harry Russell  | 1-566-905-1747 |
+----+-------------------+-------------------------+----------------+----------------+
3 rows in set (0.00 sec)

mysql> select * from client;
+----+-------------------+-------------------------+----------------+----------------+
| id | address           | email                   | name           | phone          |
+----+-------------------+-------------------------+----------------+----------------+
|  5 | New York City,USA | bill.grant@gmail.com    | Bill Grant     | 1-254-356-3311 |
|  6 | NewYork,UsA       | lillian.lewis@gmail.com | Lillian Lewis  | 1-441-498-4523 |
|  7 | Florida,USA       | harry.russell@gmail.com | Harry Russell  | 1-566-905-1747 |
|  8 | Vyrtutkjmfhrttyhy | dffrgrrthr@gmail.com    | VinithaP       | 1-566-905      |
+----+-------------------+-------------------------+----------------+----------------+
4 rows in set (0.00 sec)

mysql> select * from client;
+----+-------------------+-------------------------+----------------+----------------+
| id | address           | email                   | name           | phone          |
+----+-------------------+-------------------------+----------------+----------------+
|  5 | New York City,USA | bill.grant@gmail.com    | Bill Grant     | 1-254-356-3311 |
|  6 | NewYork,UsA       | lillian.lewis@gmail.com | Lillian Lewis  | 1-441-498-4523 |
|  7 | Florida,USA       | harry.russell@gmail.com | Harry Russell  | 1-566-905-1747 |
+----+-------------------+-------------------------+----------------+----------------+
3 rows in set (0.00 sec)

mysql>
 */
/*
 * Hibernate: insert into client (address,email,name,phone) values (?,?,?,?)
Hibernate: select c1_0.id,c1_0.address,c1_0.email,c1_0.name,c1_0.phone from client c1_0
Hibernate: insert into client (address,email,name,phone) values (?,?,?,?)
Hibernate: select c1_0.id,c1_0.address,c1_0.email,c1_0.name,c1_0.phone from client c1_0
Hibernate: insert into client (address,email,name,phone) values (?,?,?,?)
Hibernate: select c1_0.id,c1_0.address,c1_0.email,c1_0.name,c1_0.phone from client c1_0
Hibernate: select c1_0.id,c1_0.address,c1_0.email,c1_0.name,c1_0.phone from client c1_0 where c1_0.id=?
Hibernate: select c1_0.id,c1_0.address,c1_0.email,c1_0.name,c1_0.phone from client c1_0 where c1_0.id=?
Hibernate: update client set address=?,email=?,name=?,phone=? where id=?
Hibernate: select c1_0.id,c1_0.address,c1_0.email,c1_0.name,c1_0.phone from client c1_0
Hibernate: insert into client (address,email,name,phone) values (?,?,?,?)
Hibernate: select c1_0.id,c1_0.address,c1_0.email,c1_0.name,c1_0.phone from client c1_0
Hibernate: select c1_0.id,c1_0.address,c1_0.email,c1_0.name,c1_0.phone from client c1_0 where c1_0.id=?
Hibernate: delete from client where id=?
Hibernate: select c1_0.id,c1_0.address,c1_0.email,c1_0.name,c1_0.phone from client c1_0


 */