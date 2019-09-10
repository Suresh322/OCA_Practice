package com.oca.suresh.acessmodifiers;

class Caller
{
	protected void init ()
    
	{
	   System.out.println("Intialized");
	}
	
    protected void start ()
    
	{ 
	   init();
	   System.out.println("started");
	}

}
public class Q33
{
	public static void main(String[] args)
	{
		Caller c = new Caller();
		c.start();
		c.init();
		
	}

}
