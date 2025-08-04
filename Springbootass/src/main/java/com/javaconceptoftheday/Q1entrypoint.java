package com.javaconceptoftheday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages={"com"})
public class Q1entrypoint {

	public static void main(String[] args) {
		ApplicationContext con=SpringApplication.run(Q1entrypoint.class, args);
		ClassKLMQ1 p=con.getBean(ClassKLMQ1.class);
		p.pqr.display();
		ClassXYZQ1 p1=con.getBean(ClassXYZQ1.class);
		p1.display();
		
	}
}

/*
 * Hi... I am ClassABC
Hi... I am ClassXYZ
 * 
 */
