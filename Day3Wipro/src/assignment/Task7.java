/*
 * 7.A student will not be allowed to sit in exam if his/her attendence is less than 70%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not. */
package assignment;


import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of classes held:");
		int totalclasses=sc.nextInt();
		System.out.println("Number of classes attended:");
		int attendedclasses=sc.nextInt();
		double attendanceper=((double)attendedclasses/totalclasses)*100;
		System.out.printf("Percentage of class attended:%.2f \n",attendanceper);
		if (attendanceper<70)
			System.out.println("Student is not allowed to sit in exam");
		else
			System.out.println("Student is allowed to sit in exam");
		sc.close()	;
	}

}
