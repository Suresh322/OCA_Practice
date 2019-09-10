package com.oca.suresh.constructor_this_super;

class M
{
	int x;
	int y;
	public void doStuff(int x,int y)
	{
		this.x=x;
		y=this.y;
		
	}
	public void disp()
	{
		System.out.println(x+" "+y);
	}
}
public class Q44 
{

	public static void main(String[] args) 
	{
		M m1 = new M();
		m1.x=100;
		m1.y=200;
		M m2 = new M();
		m1.doStuff(m1.x, m1.y);
		m1.disp();
		m2.disp();
		
		
		
	}

}
                                                                                                                                                                                                                       