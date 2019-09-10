package com.oca.suresh.constructor_this_super;

class V
{
	int  x; 
	V()
	{
		this(10);
	}
	V(int x)
	{
		this.x=x;
	}	
}
class Car extends V
{
	int y;
	Car()
	{
	
		super();
		//this(10);
	}
	Car (int y)
	{
		this();
		this.y = y;	
	}
	public String toString()
	{
		return super.x +":"+this.y;
	}
	
}

public class Q17 
{

	public static void main(String[] args) 
	{
       V v = new Car(10);
       System.out.println(v);
      
	}

}
