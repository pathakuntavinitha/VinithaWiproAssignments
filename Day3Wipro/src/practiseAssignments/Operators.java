package practiseAssignments;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Number1: ");
		int n1=sc.nextInt();
		System.out.print("Number2: ");
		int n2=sc.nextInt();
		System.out.println("Addition: "+(n1+n2));
		if (n1>n2)
			System.out.println("Greater number: "+n1);
		else
			System.out.println("Greater number: "+n2);
		System.out.println("Are both positive?: "+(n1>0 && n2>0));
		
	}

}
