package com.mainfiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.kafka.annotation.EnableKafka;
@SpringBootApplication(scanBasePackages = "com")
@EnableJpaRepositories(basePackages = "com.repository")
@EntityScan(basePackages = "com.entity")
@EnableKafka
public class SpringBootEntryDemo {
	public static void main(String[] args) {
	      SpringApplication.run(SpringBootEntryDemo.class, args);
 
	}
}

/*
 *		 Post: http://localhost:8081/rides			==>producer
 *mysql> select * from rides;
+----+-------------+---------------+------+----------------+-----------------+
| id | driver_name | drop_location | fare | passenger_name | pickup_location |
+----+-------------+---------------+------+----------------+-----------------+
|  1 | John Doe    | Downtown      |  250 | Alice          | Airport         |
|  2 | Jawahar     | Gachibowli    |  200 | Prahalad       | Kukatpally      |
|  3 | Loknad      | Airport       |  400 | Bhuwan         | Charminar       |
+----+-------------+---------------+------+----------------+-----------------+


 *		 Put: http://localhost:8081/rides/1		==>producer

mysql> select * from rides;
+----+-------------+---------------+------+----------------+--------------------+
| id | driver_name | drop_location | fare | passenger_name | pickup_location    |
+----+-------------+---------------+------+----------------+--------------------+
|  1 | John        | Kbhp          |  500 | Ali            | Shamshabad Airport |
|  2 | Jawahar     | Gachibowli    |  200 | Prahalad       | Kukatpally         |
|  3 | Loknad      | Airport       |  400 | Bhuwan         | Charminar          |
+----+-------------+---------------+------+----------------+--------------------+

	 Delete: http://localhost:8081/rides/3		==>producer
	 mysql> select * from rides;
+----+-------------+---------------+------+----------------+--------------------+
| id | driver_name | drop_location | fare | passenger_name | pickup_location    |
+----+-------------+---------------+------+----------------+--------------------+
|  1 | John        | Kbhp          |  500 | Ali            | Shamshabad Airport |
|  2 | Jawahar     | Gachibowli    |  200 | Prahalad       | Kukatpally         |
+----+-------------+---------------+------+----------------+--------------------+
2 rows in set (0.00 sec)
 *
 *
 *		Get:http://localhost:8082/rides   		==> consumer
 *
 *		[{"id":1,"driverName":"John","passengerName":"Ali","pickupLocation":"Shamshabad Airport","dropLocation":"Kbhp","fare":500.0},
 *{"id":2,"driverName":"Jawahar","passengerName":"Prahalad","pickupLocation":"Kukatpally","dropLocation":"Gachibowli","fare":200.0}]
 *
 *	Get:http://localhost:8082/rides/1   		==> consumer
 *	
 *{"id":1,"driverName":"John","passengerName":"Ali","pickupLocation":"Shamshabad Airport","dropLocation":"Kbhp","fare":500.0}
 */