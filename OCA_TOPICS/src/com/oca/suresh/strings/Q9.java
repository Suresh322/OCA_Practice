package com.oca.suresh.strings;

public class Q9 
{

	public static void main(String[] args) 
	{
		
		String s1 = "Java";
		String s2 = new String("java");
		
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}

	}

}
