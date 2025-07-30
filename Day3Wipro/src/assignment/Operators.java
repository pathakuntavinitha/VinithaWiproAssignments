/*
 * 1.Write a program to add 8 to the number 2345 and then divide it by 3. Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result.
 * */
package assignment;
public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=2345;
		int addition=number+8;
		int quotient=addition/3;
		int modulous=quotient%5;
		int result=modulous*5;
		System.out.println(result);
		//System.out.println(((2345 + 8) / 3 % 5) * 5);
	}
}
