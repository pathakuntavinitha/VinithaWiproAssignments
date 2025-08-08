package com.springbootcontrollerfiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com"})
public class Userdataentry11 {
    public static void main(String[] args) {
        SpringApplication.run(Userdataentry11.class, args);
    }
}
/*
 * [
  {
    "id": 101,
    "firstName": "John",
    "lastName": "Doe",
    "email": "djohn@gmail.com",
    "mobile": "121-232-3435",
    "dateOfBirth": 1467240235069
  },
  {
    "id": 201,
    "firstName": "Russ",
    "lastName": "Smith",
    "email": "sruss@gmail.com",
    "mobile": "343-545-2345",
    "dateOfBirth": 1467240235069
  },
  {
    "id": 301,
    "firstName": "Kate",
    "lastName": "Williams",
    "email": "kwilliams@gmail.com",
    "mobile": "876-237-2987",
    "dateOfBirth": 1467240235069
  }
]
 */