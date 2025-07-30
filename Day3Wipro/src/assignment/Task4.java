/*4.Take name, roll number and field of interest from user and print in the format below :
Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.
*/
package assignment;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name:");
		String name=sc.nextLine();
		System.out.println("Enter Roll Number:");
		String rollno=sc.nextLine();
		System.out.println("Enter Number of interests:");
		int n =sc.nextInt();
	    sc.nextLine();
		String interests[]=new String[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Area of interests:");
			interests[i]=sc.nextLine();
		}
		String joined=String.join(",",interests);
		System.out.printf("Hey, my name is %s and my roll number is %s. My field of interests are %s",name,rollno,joined);
		sc.close();
	}
	
}
