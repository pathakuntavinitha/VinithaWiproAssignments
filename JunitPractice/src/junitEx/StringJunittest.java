package junitEx;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringJunittest {
	@Test
	public void teststring()
	{
	 String res=StringTest.reverse("hello");
	 assertEquals("0lleh",res);
	}
	@Test
	public void isempty()
	{
		String res=StringTest.reverse("");
		assertEquals("",res);
		
	}
	

}
