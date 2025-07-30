package assignment;
/*
 * 
31.Write a program to demonstrate the InputMismatchException and StringIndexOutOfBoundsException.
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.print("Enter an integer:");
            int number=sc.nextInt();
            System.out.println("Number is"+number);
        }
		catch (InputMismatchException e) 
		{
            System.out.println("InputMismatchException:Please enter a valid integer");
        }
		sc.nextLine();
		try
		{
			System.out.println("Enter String:");
            String text=sc.nextLine();
            System.out.println("Enter index");
            int index=sc.nextInt();
            char ch=text.charAt(index);
            System.out.println("Character at index"+index+" is :"+ch); 
            
		}
		
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBoundsException:Index is out of range");
		}
		catch (InputMismatchException e) 
		{
            System.out.println("InputMismatchException:Please enter a valid String");
        }
		
	}

}
