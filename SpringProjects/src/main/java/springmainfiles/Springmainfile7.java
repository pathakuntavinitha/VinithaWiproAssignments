package springmainfiles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springassignment7.Purchase;

public class Springmainfile7 {
	public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig7.xml");
		Purchase p=(Purchase) context.getBean("purobj");
		p.displayDetails();
	}
}
/**Output:
	Purchase ID 1
	Purchase Date 2025-08-01
	Product ID 1
	Product Name Laptop
	Price 70000.0
**/