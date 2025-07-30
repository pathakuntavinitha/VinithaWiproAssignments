package assignment;
import java.util.Scanner;
/*
 * 11.Create a class called Calculator which has 4 different methods add, diff, mul and div which 
accepts two numbers as parameters. Create an object to access these methods and invoke 
these methods with two numbers and display the result in the corresponding methods. 
*/
public class Calculator {
	
	public  int add(int a,int b)
	{
		return  a+b;
	}
	public  int diff(int a,int b)
	{
		return a-b;
	}
	public  int mul(int a,int b)
	{
		return a*b;
	}
	public int div(int a,int b)
	{
				if (b==0)
				{
				System.out.println("Cannot divide by zero");
				return 0;
				}
		return a/b;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		Calculator obj=new Calculator();
		int a=obj.add(n1,n2);
		System.out.println(a);
		int s=obj.diff(n1,n2);
		System.out.println(s);
		int m=obj.mul(n1,n2);
		System.out.println(m);
		int d=obj.div(n1,n2);
		
		
		
		System.out.println(d);
		
		
		// TODO Auto-generated method stub

	}

}
