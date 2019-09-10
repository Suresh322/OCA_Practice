package com.oca.suresh.typecasting_wrapper;

class A
{
	public void test()
	{
		System.out.println("test() in Class-A");
	}
}
class B extends A
{
	public void test()
	{
		System.out.println("test() in Class-B");
	}
}
class C extends A
{
	public void test()
	{
		System.out.println("test() in Class-C");
	}
}
public class Q3 
{

	public static void main(String[] args) 
    {
		A b1 = new A();
		A b2 = new C();
		b1 = (A)b2;
		//A b3 =(B)b2;
		b1.test();
		b2.test();
		
		

	}

}
