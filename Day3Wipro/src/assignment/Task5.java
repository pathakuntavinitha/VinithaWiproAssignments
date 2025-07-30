/*
 * 5.A company decided to give bonus of 10% to employee if his/her year of service is more than 6 years.
Ask user for their salary and year of service and print the net bonus amount.

 */
package assignment;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Salary:");
		int salary=sc.nextInt();
		System.out.println("How many years of service do you have:");
		int service=sc.nextInt();
		if(service>6)
		{
			double bonus=0.1*salary;
			System.out.println("Bonus amount: "+bonus);
		}
		
		// TODO Auto-generated method stub
		sc.close();

	}

}
