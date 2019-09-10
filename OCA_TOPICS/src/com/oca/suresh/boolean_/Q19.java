package com.oca.suresh.boolean_;

public class Q19 
{
	public static final int min = 1;
	
	public static boolean check(int x)
	{
		return(x>=min)?true:false;
	}
	
	public static void main(String[] args) 
	{
		int x = args.length;
		System.out.println("args length ="+x);
		if(check(x))
		{
			System.out.println("Java SE");
		}
		else
		{
			System.out.println("Java EE");
		}	
	}
}
