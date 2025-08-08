package com.springbootentryfiles;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import com.springbootbeanfiles.Propertiesass2;
@SpringBootApplication
@ComponentScan(basePackages={"com"})
public class PropertiesentryQ2 {
	public static void main(String[] args) {
		ApplicationContext con=SpringApplication.run(PropertiesentryQ2.class, args);
		Propertiesass2 p=con.getBean(Propertiesass2.class);
		p.getValueInteger();
		p.getValueBoolean();
		p.getValueDouble();
	
	}
}
/*Integer9876
Booleantrue
Double1.75
 * 
 */