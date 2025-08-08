package com.springbootcontrollerfiles;
/*
 * 
mysql> use employeedb;
Database changed
mysql> show tables;
+----------------------+
| Tables_in_employeedb |
+----------------------+
| employee             |
| employeedata         |
+----------------------+
2 rows in set (0.00 sec)

Post:http://localhost:8081/SpringBootRestApi/api/user

mysql> select * from employeedata;
+----+------+-------+--------+
| id | age  | name  | salary |
+----+------+-------+--------+
|  1 |   22 | Vinni | 884579 |
|  2 |   23 | Latha |   4579 |
+----+------+-------+--------+
2 rows in set (0.00 sec)

mysql> select * from employeedata;
+----+------+--------+--------+
| id | age  | name   | salary |
+----+------+--------+--------+
|  1 |   22 | Vinni  | 884579 |
|  2 |   23 | Latha  |   4579 |
|  3 |   24 | Vishnu | 334579 |
+----+------+--------+--------+
3 rows in set (0.00 sec)


Get:http://localhost:8081/SpringBootRestApi/api/user/12
{"errorMessage":"User with id 12 not found"}

Put:http://localhost:8081/SpringBootRestApi/api/user/2
{
    "name":"Eswara",
    "age":30,
    "salary":40000
}

mysql> select * from employeedata;
+----+------+--------+--------+
| id | age  | name   | salary |
+----+------+--------+--------+
|  1 |   22 | Vinni  | 884579 |
|  2 |   30 | Eswara |  40000 |
|  3 |   24 | Vishnu | 334579 |
+----+------+--------+--------+
3 rows in set (0.00 sec)


Delete: http://localhost:8081/SpringBootRestApi/api/user/1

Deleted successfully!

mysql> select * from employeedata;
+----+------+--------+--------+
| id | age  | name   | salary |
+----+------+--------+--------+
|  2 |   30 | Eswara |  40000 |
|  3 |   24 | Vishnu | 334579 |
+----+------+--------+--------+
2 rows in set (0.00 sec)

mysql>
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com"})
@EnableJpaRepositories("com.repository")
@EntityScan("com.springbootbeanfiles")
public class Employeeentry {
    public static void main(String[] args) {
        SpringApplication.run(Employeeentry.class, args);
    }
}
/*Hibernate: insert into employeedata (age,name,salary) values (?,?,?)
Hibernate: select e1_0.id,e1_0.age,e1_0.name,e1_0.salary from employeedata e1_0
Hibernate: insert into employeedata (age,name,salary) values (?,?,?)
Hibernate: select e1_0.id,e1_0.age,e1_0.name,e1_0.salary from employeedata e1_0
Hibernate: insert into employeedata (age,name,salary) values (?,?,?)
Hibernate: select e1_0.id,e1_0.age,e1_0.name,e1_0.salary from employeedata e1_0 where e1_0.id=?
Hibernate: select e1_0.id,e1_0.age,e1_0.name,e1_0.salary from employeedata e1_0 where e1_0.id=?
Hibernate: select e1_0.id,e1_0.age,e1_0.name,e1_0.salary from employeedata e1_0 where e1_0.id=?
Hibernate: select e1_0.id,e1_0.age,e1_0.name,e1_0.salary from employeedata e1_0 where e1_0.id=?
Hibernate: update employeedata set age=?,name=?,salary=? where id=?
Hibernate: select e1_0.id,e1_0.age,e1_0.name,e1_0.salary from employeedata e1_0 where e1_0.id=?
Hibernate: update employeedata set age=?,name=?,salary=? where id=?
Hibernate: select count(*) from employeedata e1_0 where e1_0.id=?
Hibernate: select e1_0.id,e1_0.age,e1_0.name,e1_0.salary from employeedata e1_0 where e1_0.id=?
Hibernate: delete from employeedata where id=?

 * 
 */
