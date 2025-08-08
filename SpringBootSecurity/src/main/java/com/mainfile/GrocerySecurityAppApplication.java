package com.mainfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com"})
public class GrocerySecurityAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(GrocerySecurityAppApplication.class, args);
    }
}
/*	http://localhost:8081/grocery/public
 * 
 * Welcome to grocery store this is public endpoint
 * 
 * http://localhost:8081/grocery/items
 * ["Rice","Milk","Bread","Oil"]
 * 
 * * http://localhost:8081/grocery/items
 * ["Rice","Milk","Bread","Oil"] 
 * 
 * http://localhost:8081/grocery/items 
 * if either the password or username is wrong when accessing a secured end point  it returns HTTP 401 unauthorized
 * 
 
 * http://localhost:8081/grocery/orders
 * ["Order1","Order2"]
 * 
 * http://localhost:8081/grocery/admin
 * Admin only secure information
 * 
 *  http://localhost:8081/grocery/user
 *  403 forbidden
 *  
 *  The username and password is correct and we authenticate succesfull but we don't have the required authority to access the end point
 */
