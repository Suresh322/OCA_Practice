package com.oca.suresh.constructor_this_super;

class CD
{
	int r;
	CD(int r)
	{
		this.r=r;	
	}
}

class DVD extends CD
{
	int c;
	DVD(int r,int c)
	{
		super(r);
		this.c=c;
	}
	
	void display()
	{
		System.out.println(r+ " " + c);
	}
}

public class Q97 {

	public static void main(String[] args) 
	{
       DVD d= new DVD(100,300);
       d.display();
       
	}

}
