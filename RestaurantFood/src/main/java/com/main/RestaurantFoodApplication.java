package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages= {"com"})
@EnableJpaRepositories(basePackages = "com.repository")
@EntityScan(basePackages = "com.entity")
public class RestaurantFoodApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantFoodApplication.class, args);
	}

}
/*Post:http://localhost:8082/api/restaurants
 * mysql> use restaurantfood;
Database changed
mysql> show tables;
+--------------------------+
| Tables_in_restaurantfood |
+--------------------------+
| food                     |
| restaurant               |
+--------------------------+
2 rows in set (0.01 sec)

mysql> select * from restaurant;
+----+-----------+----------+
| id | location  | name     |
+----+-----------+----------+
|  1 | Hyderabad | Mehfil   |
|  2 | Banglore  | Paradise |
+----+-----------+----------+
2 rows in set (0.00 sec)

mysql> select * from restaurant;
+----+-----------+-------------+
| id | location  | name        |
+----+-----------+-------------+
|  1 | Hyderabad | Mehfil      |
|  2 | Banglore  | Paradise    |
|  3 | Hyderabad | Pista House |
+----+-----------+-------------+
 * 
 * Get:http://localhost:8082/api/restaurants
 * mysql> select * from restaurant;
+----+-----------+-------------+
| id | location  | name        |
+----+-----------+-------------+
|  1 | Hyderabad | Mehfil      |
|  2 | Banglore  | Paradise    |
|  3 | Hyderabad | Pista House |
+----+-----------+-------------+
 * 
 * Delete::http://localhost:8082/api/restaurants/2
 * mysql> select * from restaurant;
+----+-----------+-------------+
| id | location  | name        |
+----+-----------+-------------+
|  1 | Hyderabad | Mehfil      |
|  3 | Hyderabad | Pista House |
+----+-----------+-------------+
2 rows in set (0.00 sec)


Post:http://localhost:8082/api/restaurants/1/foods
mysql> select * from food;
+----+---------+-------+---------------+
| id | name    | price | restaurant_id |
+----+---------+-------+---------------+
|  1 | Mehfil  |  NULL |             1 |
|  2 | Noodles |   100 |             1 |
+----+---------+-------+---------------+
2 rows in set (0.00 sec)
Delete:http://localhost:8082/api/restaurants/foods/1
mysql> select * from food;
+----+---------+-------+---------------+
| id | name    | price | restaurant_id |
+----+---------+-------+---------------+
|  2 | Noodles |   100 |             1 |
+----+---------+-------+---------------+
1 row in set (0.00 sec)

post:http://localhost:8082/api/restaurants/3/foods
mysql> select * from food;
+----+---------+-------+---------------+
| id | name    | price | restaurant_id |
+----+---------+-------+---------------+
|  2 | Noodles |   100 |             1 |
|  3 | Burger  |   200 |             3 |
+----+---------+-------+---------------+
2 rows in set (0.00 sec)
 */
