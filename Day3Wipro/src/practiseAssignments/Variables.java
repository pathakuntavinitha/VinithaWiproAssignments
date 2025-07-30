package practiseAssignments;

import java.util.Scanner;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("ID: ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.print("Name: ");
		String name=sc.nextLine();
		System.out.print("Marks: ");
		float marks=sc.nextFloat();
		System.out.print("Grade: ");
		char grade=sc.next().charAt(0);
		System.out.println("Student ID : "+id);
		System.out.println("Name: "+name);
		System.out.println("Marks: "+marks);
		System.out.println("grade: "+grade);

	}

}
