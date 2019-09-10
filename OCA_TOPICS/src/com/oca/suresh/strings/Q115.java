package com.oca.suresh.strings;

public class Q115 
{
   String myStr="7007";
   
	public static void main(String[] args) 
	{
		Q115 q = new Q115();
		q.dostuff("9009");

	}
	public void dostuff(String str)
	{
		int mynum=0;
		try
		{
			String myStr=str;
			mynum=Integer.parseInt(myStr);	
		}
		catch(Exception e)
		{
			System.out.println("Error");	
		}
		System.out.println(myStr +" : "+ mynum);
	}

}
