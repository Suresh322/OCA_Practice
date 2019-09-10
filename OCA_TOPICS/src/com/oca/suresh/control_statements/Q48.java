package com.oca.suresh.control_statements;

public class Q48 
{

	public static void main(String[] args) 
	{
		int data [] = {2010,2013,2014,2015,2014};
		int key = 2014;
		int count = 0;
		for ( int a: data) 
		{
			if(a!=key)
			{
				count++;
				continue;
				//count++;	CError (Unreachable statement)
			}
		}
		System.out.println(count);

	}

}
