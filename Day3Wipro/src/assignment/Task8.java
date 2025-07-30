/*
 * 8.Modify the above question to allow student to sit if he/she has medical cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly
 */
package assignment;

import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of classes held:");
		int totalclasses=sc.nextInt();
		System.out.println("Number of classes attended:");
		int attendedclasses=sc.nextInt();
		double attendanceper=((double)attendedclasses/totalclasses)*100;
		System.out.printf("Percentage of class attended:%.2f \n",attendanceper);
		if (attendanceper>=70)	
			System.out.println("Student is allowed to sit in exam");
		else
		{
			System.out.println("Do you have medical cause Y/N? ");
			char medical=sc.next().charAt(0);
			if(medical=='Y' || medical=='y')
				System.out.println("Student is allowed to sit in exam");
			else if(medical=='N' || medical=='n')
				System.out.println("Student is not allowed to sit in exam");
		}	
		sc.close();

}
}
