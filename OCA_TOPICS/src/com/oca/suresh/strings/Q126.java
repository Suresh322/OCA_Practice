package com.oca.suresh.strings;

public class Q126 
{
   public static void main(String[] args) 
	{
	   StringBuilder sb = new StringBuilder("Java");
	   String s ="Java";
	   
	   if(sb.equals(s))
	   {
		   System.out.println("Match_1");
	   }
	   else if(sb.toString().equals(s.toString()))
	   {
		   System.out.println("Match_2");
	   }
	   else 
	   {
		   System.out.println("No_Match ");
	   }

	}

}
