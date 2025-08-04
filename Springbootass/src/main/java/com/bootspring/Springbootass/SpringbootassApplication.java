package com.bootspring.Springbootass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com"})
public class SpringbootassApplication {

	public static void main(String[] args) {
		ApplicationContext con=SpringApplication.run(SpringbootassApplication.class, args);
		Firstspringboot b1=con.getBean(Firstspringboot.class);
		b1.display();
	}

}

//output
/*
:: Spring Boot ::                (v3.5.4)

2025-08-03T09:42:57.352+05:30  INFO 25148 --- [Springbootass] [           main] c.b.S.SpringbootassApplication           : Starting SpringbootassApplication using Java 17.0.12 with PID 25148 (C:\Users\patha\Downloads\Springbootass\Springbootass\target\classes started by patha in C:\Users\patha\Downloads\Springbootass\Springbootass)
2025-08-03T09:42:57.362+05:30  INFO 25148 --- [Springbootass] [           main] c.b.S.SpringbootassApplication           : No active profile set, falling back to 1 default profile: "default"
2025-08-03T09:42:59.994+05:30  INFO 25148 --- [Springbootass] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8098 (http)
2025-08-03T09:43:00.025+05:30  INFO 25148 --- [Springbootass] [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2025-08-03T09:43:00.026+05:30  INFO 25148 --- [Springbootass] [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.43]
2025-08-03T09:43:00.138+05:30  INFO 25148 --- [Springbootass] [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2025-08-03T09:43:00.141+05:30  INFO 25148 --- [Springbootass] [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 2648 ms
2025-08-03T09:43:00.835+05:30  INFO 25148 --- [Springbootass] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8098 (http) with context path '/'
2025-08-03T09:43:00.851+05:30  INFO 25148 --- [Springbootass] [           main] c.b.S.SpringbootassApplication           : Started SpringbootassApplication in 4.356 seconds (process running for 4.952)
This is my first spring boot
*/