package com.oca.suresh.constructor_this_super;

class MyString
{
	String msg;
	MyString (String msg)
	{
		this.msg=msg;	
	}
}
public class Q100 
{

	public static void main(String[] args) 
	{
		System.out.println("Hello "+ new StringBuilder("java SE 8_StringBuilder"));
		System.out.println("Hello "+ new MyString("java SE 8_MyString").msg);
		System.out.println("Hello "+ new StringBuffer("java SE 8_StringBuffer"));
		System.out.println("Hello "+ new String("java SE 8_String"));

	}

}
