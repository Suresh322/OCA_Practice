package com.oca.suresh.constructor_this_super;

import java.util.ArrayList;
import java.util.List;

class Patient
{
	String name ;
	
	Patient(String name)
	{
		this.name=name;
		
	}
}
public class Q12 
{

	public static void main(String[] args) 
	{
	    List ps = new ArrayList();
		Patient p = new Patient("Mike");
		ps.add(p);
		System.out.println(ps.size());
		int f = ps.indexOf(p);
		System.out.println("f value is :"+f);
		if (f>0)
		{
			System.out.println("Mike found");
	    }
		
//		String s = "oracle corp";
//		int x = s.indexOf("or");
//		int y = s.indexOf("or",2);
//		int z = s.indexOf('r');
//		System.out.println(x+" "+y+" "+z);
		
		
		
		
    }
}