package com.oca.suresh.strings;

public class Q105 
{

	public static void main(String[] args) 
	{
       String s1 = "Java";
       String s2= "Java";
       //System.out.println(s1==s2);
       String [] s3 = { "J","a","v","a"};
       String s4 = "";
       for (String s : s3)
       {
    	 s4=s4+s; 
       }
       System.out.println(s1==s4);
       System.out.println(s1.equals(s4));
       
	}

}
