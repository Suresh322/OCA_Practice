package com.oca.suresh.constructor_this_super;

class Animal
{
	String type="Canine";
	int maxspeed=60;
	
	Animal() 
	{
		
	}
	Animal(String type,int maxspeed)
	{
		this.type=type;
		this.maxspeed=maxspeed;	
	}
}

class Wolf extends Animal
{
	String bounds;
	
	Wolf(String bounds)
	{    
		super();
		this.bounds=bounds;
	}
	Wolf(String type,int maxspeed,String bounds)
	{
		super(type,maxspeed);
		this.bounds=bounds;
		
	}	
}

public class Q122 
{
  public static void main(String[] args) 
	{
	  Wolf w1 = new Wolf("Long");
	 Wolf w2 = new Wolf("Feiune",80,"Short");
	 System.out.println(w1.type +" "+ w1.maxspeed+" "+ w1.bounds);
	 System.out.println(w2.type +" "+ w2.maxspeed+" "+ w2.bounds);

	}

}
