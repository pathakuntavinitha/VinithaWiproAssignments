package com.springbootcontrollerfiles;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com"})
public class Bookjdbcentry12 {
    public static void main(String[] args) {
        SpringApplication.run(Bookjdbcentry12.class, args);
    }
}
//Get:http://localhost:8081/api/books
/*
 * [
    {
        "bookid": 982,
        "bookname": "Programming with Java",
        "author": "E.Balagurusamy",
        "price": 350
    },
    {
        "bookid": 5433,
        "bookname": "Core and Advance Java",
        "author": "R. Nageswara rao",
        "price": 800
    },
    {
        "bookid": 6321,
        "bookname": "Data Structures and Algorithms in Java",
        "author": "Robert Lafore",
        "price": 590
    },
    {
        "bookid": 6830,
        "bookname": "Exploring C",
        "author": "Yashavant Kanetkar",
        "price": 670
    }
]
 */
