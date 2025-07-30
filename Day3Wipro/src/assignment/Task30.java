package assignment;
/*
 *30.Write a interface method minimum3 that returns the smallest of three floating-point numbers. 
 *Use the Math.min method to implement minimum3. 
Incorporate the method into an application that reads three values from the user, 
determines the smallest value and displays the result.
 Use method references syntax. 
 */
import java.util.Scanner;
interface MinimumFindThree
{
	float minimum3(float a,float b,float c);
}

public class Task30 {
	public static float MinResult(float a,float b,float c)
	{
		return Math.min(a,Math.min(b,c));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        float num1=sc.nextFloat();
        System.out.print("Enter second number:");
        float num2=sc.nextFloat();
        System.out.print("Enter third number:");
        float num3=sc.nextFloat();
        MinimumFindThree minthree=Task30::MinResult;
        float result=minthree.minimum3(num1, num2, num3);
        System.out.println("The smallest value is"+result);
      
		
	}

}
