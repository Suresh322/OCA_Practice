package com.oca.suresh.boolean_;

public class Q82 {

	public static void main(String[] args) 
	{
		String stuff = "TV";
		String res = null;
		
		if(stuff.equals("TV"))
		{
			res="Whitey";
		}
		if(stuff.equals("Movie"))
		{
			res="Blacky";
		}
		else 
		{
			res="No Result";
		}
		
		//(stuff.equals("TV")) ? "Whitey" :(stuff.equals("Movie")) ?"Blacky" :"No Result";
		System.out.println(res);
		
	}
}
