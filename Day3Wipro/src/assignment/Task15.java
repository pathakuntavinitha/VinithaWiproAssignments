package assignment;
/*
 * 14.Create a class called shape with the following methods
1. area
2. perimeter

 Overload the area and perimeter method to calculate for both square and rectangle.
 Create a main class and invoke the area method to calculate the area of the square and 
rectangle. Also invoke the perimeter method to calculate the perimeter of the square 
and rectangle.
 */
import java.util.Scanner;
class Shape
{
	public int area(int side)
	{
		return side*side;
	}
	public int area(int length,int breadth)
	{
		return length*breadth;
	}
	public int perimeter(int side)
	{
		return 4*side;
	}
	public int perimeter(int length,int breadth)
	{
		return 2*(length+breadth);
	}
}

public class Task15 {

	public static void main(String[] args) {
		Shape obj=new Shape();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side");
		int side=sc.nextInt();
		System.out.println("Enter length");
		int length=sc.nextInt();
		
		System.out.println("Enter breadth");
		int breadth=sc.nextInt();
		
		System.out.println("Area of Square:"+obj.area(side));
		System.out.println("Area of Rectangle:"+obj.area(length,breadth));
		System.out.println("Perimeter of Square:"+obj.perimeter(side));
		System.out.println("Perimete of Rectangle:"+obj.perimeter(length,breadth));
		
		
		
				
		
		// TODO Auto-generated method stub

	}

}
