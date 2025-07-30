package assignment;
/*
 * 32.By using multiple catch blocks, write a class to demonstrate the order of the execution of the 
catch blocks usingNegativeArraySizeException,ArrayIndexOutOfBoundsException, 
StringIndexOutOfBoundsException, IndexOutOfBoundsException, NullPointerException,          
ArithmeticException and print the stack trace for each exception.

 */

import java.util.List;
import java.util.ArrayList;
public class Task32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exception Tracing");
	    try 
	    {
	       int[] arr = new int[-5];
	    } 
	    catch (NegativeArraySizeException e) {
	        System.out.println("NegativeArraySizeException");
	        e.printStackTrace();
	    }
	    System.out.println("Exception Tracing");
	    try 
	    {
	        int[] arr=new int[3];
	        int value=arr[5]; 
	    } 
	    catch (ArrayIndexOutOfBoundsException e) {
	        System.out.println("ArrayIndexOutOfBoundsException");
	        e.printStackTrace();
	    }
	    System.out.println("Exception Tracing");
	    try 
	    {
	        String str="Java";
	        char ch=str.charAt(10);
	    } catch (StringIndexOutOfBoundsException e) {
	        System.out.println("StringIndexOutOfBoundsException");
	        e.printStackTrace();
	    }
	    System.out.println("Exception Tracing");
	    try 
	    {
	    	List<Integer> list=new ArrayList<>();
	        list.add(10);
	        System.out.println(list.get(2));
	    } catch (IndexOutOfBoundsException e) {
	        System.out.println("IndexOutOfBoundsException");
	        e.printStackTrace();
	    }
	    System.out.println("Exception Tracing");
	    try 
	    {
	        String str = null;
	        System.out.println(str.length()); 
	    } catch (NullPointerException e) {
	        System.out.println("Caught NullPointerException");
	        e.printStackTrace();
	    }
	    System.out.println("Exception Tracing");
	    try 
	    {
	        int result=10/0; 
	    } catch (ArithmeticException e) {
	        System.out.println("Caught ArithmeticException");
	        e.printStackTrace();
	    }
	
	    System.out.println("Program completed.");


	}
	

}
