package practiseAssignments;

import java.util.Scanner;

public class Flowcontrol {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Number: ");
		int n=sc.nextInt();
		String res=n<0?"The number is negative":(n>0?"The number is Positive":"The number is Zero");
		// TODO Auto-generated method stub
		System.out.println(res);
	}

}
