package springmainfiles;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springassignmentsQ2andQ4.Account;
import springassignmentsQ2andQ4.Account4;

//import springPractice.Product;
//import springPractice.Student_Course;
public class SpringCoreMainfiles {
		public static void main(String args[])
		{
		@SuppressWarnings("resource")
		ApplicationContext beanfactoryobj12 = new ClassPathXmlApplicationContext("SpringIOC.xml");
		/*AbstractApplicationContext context=new AnnotationConfigApplicationContext("Product.class");
		Product prod=(Product) context.getBean("productobject");
		System.out.println(prod.toString());
		
		*/
		/*
		Student_Course b21 = (Student_Course) beanfactoryobj12.getBean("mybean3");// bean object=>2+2=4bean properties
		System.out.println("Student Data:: " + b21.getSid() + " " + b21.getSname() + " " + b21.getCourseid() + " "
				+ b21.getCoursename());
				*/
		
		Account obj=(Account) beanfactoryobj12.getBean("accountobj"); 
		obj.Printdetails();
		Account4 obj1=(Account4) beanfactoryobj12.getBean("ac4obj");
		obj1.Print();
		}		
}
/*Assignment2 Output:
 * Account Details 
Account Number      : 1377593757
Account Holder Name : Vinitha
Balance             : 10876.0
Bank ID             : 101
Bank Name           : Canara
*/

/* Assignment4output
Account Details 
Account Number      : 45546
Account Holder Name : Vinitha
Balance             : 46543.0
Account Type        : Savings
*/

