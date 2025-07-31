package com.example.MavenProject;
public class Division {
	public  int div(int a,int b)
	{
		if(b==0)
		{
			throw new IllegalArgumentException("B can't divide by zero");
		}
		return a/b;
	}

}

