package assignment;
/*
 * 15.Write a program to construct an array with 10 elements and to find the number of    
occurrences of each element in the Array.

 */
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class Task12 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=10;
		int arr[]=new int[n];
		for (int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Map<Integer,Integer> ob=new HashMap<>();
		for (int i=0;i<n;i++)
		{
			int key=arr[i];
			ob.put(key,ob.getOrDefault(key, 0)+1);
		}
		for(Map.Entry<Integer,Integer> entry :ob.entrySet())
		{
			System.out.println("Key: "+entry.getKey()+" -ValueOccurance: "+entry.getValue());
		}
		
	}

}
