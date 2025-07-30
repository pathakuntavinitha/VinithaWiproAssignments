package assignment;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.*;
/* 26 Given integer array, remove the duplicate elements and print sum of even 
numbers in the array.
input 1={2,3,54,1,6,7,7}
*/
public class Task17 {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Set<Integer> obj=new HashSet<>();
		for( int i=0;i<n;i++)
		{
			obj.add(arr[i]);
		}
		int sum=obj.stream().filter(p->p%2==0).mapToInt(Integer::intValue).sum();
		System.out.println("Sum of Even numbers: "+sum);
		/*
		for( int i=0;i<n;i++)
		{
			
			if(arr[i]%2==0)
			{
				obj.add(arr[i]);
				sum+=arr[i];
			}
			
		}

		System.out.println("Sum of Even numbers: "+sum);
		// TODO Auto-generated method stub
		
		*/

	}

}
