package com.springbootcontrollerfiles;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com"})
public class Usermainentry8 {
    public static void main(String[] args) {
        SpringApplication.run(Usermainentry8.class, args);
    }
}
/**
 * 
 * {
  "firstName": "Bushan",
  "lastName": "Sirgu",
  "age": 28
}

 */
//http://localhost:8081/users
