package com.oca.suresh.typecasting_wrapper;

class Base
{
	public void test()
	{
		System.out.println("test() in Class-Base");
	}
}
class DA extends Base
{
	public void test()
	{
		System.out.println("test() in Class-DA");
	}
}
class DB extends DA
{
	public void test()
	{
		System.out.println("test() in Class-DB");
	}
}
public class Q23 
{

	public static void main(String[] args) 
	{
		Base b1 = new DB();
		Base b2 = new DA();
		Base b3 = new DB();
		b1 = (Base)b3;
		Base b4 = (DA)b3;
		b1.test();
		b4.test();
		b2.test();
      
	}

}
