package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com"})
public class RestTemplateClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestTemplateClientApplication.class, args);
    }
}

/*
 * http://localhost:8081/client/posts
 *	{
    "userId": 1,
    "id": 101,
    "title": "New Post",
    "body": "This is a new post content"
	}
http://localhost:8081/client/posts/1
Updated successfully!
http://localhost:8081/client/posts/2
Deleted successfully!
 */