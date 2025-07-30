package assignment;
import java.util.Scanner;
import java.util.function.IntPredicate;
/*
 * 28.Write the following methods that return a lambda expression performing a specified action:

PerformOperation isOdd(): The lambda expression must return true  if a number is odd or false  if it is even.
PerformOperation isPrime(): The lambda expression must return  true if a number is prime or false  if it is composite.
PerformOperation isPalindrome(): The lambda expression must return true   if a number is a palindrome or false  if it is not.
 */

public class Task28 {
	public static IntPredicate isOdd()
	{
		return num->num%2!=0;
	}
	public static IntPredicate isPrime()
	{
		return num->{ if (num<2) return false;
				for(int i=2;i<Math.sqrt(num);i++)
				{
					if (num%i==0) return false;
				}
		return true;
		};
				
	}
	public static IntPredicate isPalindrome()
	{
		return num->{
			int rev=0,original=num;
			while(num>0)
			{
				rev=rev*10+num%10;
				num/=10;
			}
			return original==rev;
			
		};
	}
	
public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int number=sc.nextInt();
		System.out.println("Odd?"+isOdd().test(number));
        System.out.println("Prime? "+isPrime().test(number));
        System.out.println("Palindrome? "+isPalindrome().test(number));
		
		// TODO Auto-generated method stub

	}

}
/*
 * Output:
 * 
 * Enter number
242
Odd?false
Prime? false
Palindrome? true
 */

