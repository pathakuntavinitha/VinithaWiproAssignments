package assignment;
/*
 * 16.Write a program that prompts user for the mark (between 0-100 in int) of 3 students; computes the average (in double); and prints the result rounded to 2 decimal places. Your program needs to perform input validation. For examples,

Enter the mark (0-100) for student 1: 56
Enter the mark (0-100) for student 2: 101
Invalid input, try again...
Enter the mark (0-100) for student 2: -1
Invalid input, try again...
Enter the mark (0-100) for student 2: 99
Enter the mark (0-100) for student 3: 45
The average is: 66.67

 * 
 */
import java.util.Scanner;
public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int i=0;
		int allmarks[]=new int[n];
		Scanner sc=new Scanner(System.in);
		while(i<n)
		{
			System.out.printf("Enter the mark (0-100) for student"+(i+1)+" ");
			if (!sc.hasNext())
			{
				System.out.println("Invalid input! Enter again:");
				sc.nextInt();
				continue;
			}
			int mark=sc.nextInt();
			if (mark<0 || mark>100)
			{
				System.out.println("Invalid input! Enter again:");
			}
			else
			{
				allmarks[i]=mark;
				i++;
			}		
		}
		double sum=0;
		for(int mark:allmarks)
		{
			sum+=mark;
		}
		double average=sum/n;
		System.out.printf("The average is %.2f",average);
	}

}
