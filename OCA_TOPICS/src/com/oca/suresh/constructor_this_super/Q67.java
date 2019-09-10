package com.oca.suresh.constructor_this_super;

class Planet
{
	public String name;
	public int moons;
	

    public Planet(String name ,int moons)
    {	
	  this.name=name;
	  this.moons=moons;
    }

}

public class Q67 
{
	public static void main(String[] args) 
	{
		Planet [] pp = { new Planet("Mercury", 0),
				         new Planet("Venus", 0),
				         new Planet("Earth", 1),
				         new Planet("Mars",2)};
		
		System.out.println(pp);
		System.out.println(pp[2]);
		System.out.println(pp[2].moons);
	}
		
		
}

