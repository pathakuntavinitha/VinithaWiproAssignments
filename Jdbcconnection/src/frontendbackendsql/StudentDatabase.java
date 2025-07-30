package frontendbackendsql;
/*
 * 
mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| mysql              |
| performance_schema |
| sakila             |
| sys                |
| wipro              |
| world              |
+--------------------+
7 rows in set (0.11 sec)

mysql> create database student;
Query OK, 1 row affected (0.06 sec)

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| mysql              |
| performance_schema |
| sakila             |
| student            |
| sys                |
| wipro              |
| world              |
+--------------------+
8 rows in set (0.00 sec)

mysql> use student
Database changed
mysql> create table StudentT(stud_id int,name varchar(20),age int,course varchar(20),marks int);
Query OK, 0 rows affected (0.12 sec)

mysql> desc StudentT;
+---------+-------------+------+-----+---------+-------+
| Field   | Type        | Null | Key | Default | Extra |
+---------+-------------+------+-----+---------+-------+
| stud_id | int         | YES  |     | NULL    |       |
| name    | varchar(20) | YES  |     | NULL    |       |
| age     | int         | YES  |     | NULL    |       |
| course  | varchar(20) | YES  |     | NULL    |       |
| marks   | int         | YES  |     | NULL    |       |
+---------+-------------+------+-----+---------+-------+
5 rows in set (0.03 sec)

mysql> insert into StudentT values(1,'Vinitha',22,'FSJava',100);
Query OK, 1 row affected (0.01 sec)

mysql> insert into StudentT values(2,'latha',23,'FSPython',80);
Query OK, 1 row affected (0.01 sec)

mysql> insert into StudentT values(3,'Swati',29,'Data Science',90);
Query OK, 1 row affected (0.01 sec)

mysql> select * from StudentT;
+---------+---------+------+--------------+-------+
| stud_id | name    | age  | course       | marks |
+---------+---------+------+--------------+-------+
|       1 | Vinitha |   22 | FSJava       |   100 |
|       2 | latha   |   23 | FSPython     |    80 |
|       3 | Swati   |   29 | Data Science |    90 |
+---------+---------+------+--------------+-------+
3 rows in set (0.00 sec)

mysql>

 */
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;


public class StudentDatabase {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Vinitha@123");
			Statement sta=con.createStatement();
			ResultSet rs=sta.executeQuery("select * from StudentT");
			)
		{
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getInt(5));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Done");
		}
		
	}

}