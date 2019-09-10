package com.oca.suresh.constructor_this_super;

class Test
{
	int x ,  y;
	public Test(int x, int y)
	{
		intilize(x,y);
	}
	public void intilize(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
}

public class Q16 {

	public static void main(String[] args) 
	{
		int x= 3;
		int y= 5;
		Test t = new Test(x,y);
		System.out.println(x +" "+y);
		t.intilize(x, y);

	}

}
