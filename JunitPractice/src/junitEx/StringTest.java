package junitEx;

public class StringTest {
 public static String reverse(String text)
 {
	 if(text==null)
	 {
		 throw new IllegalArgumentException("Input cannot be null");
	 }
	 return new StringBuilder(text).reverse().toString();
 } 
}
