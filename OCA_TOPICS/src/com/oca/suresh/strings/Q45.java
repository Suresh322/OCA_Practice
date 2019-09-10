package com.oca.suresh.strings;

public class Q45 
{
	 int a1;
	 public static void doProduct(int a)
	 {
		 a=a*a;
	 }
	 public static void doString(StringBuilder s)
	 {
		 s.append(" "+s);
	 }

	public static void main(String[] args) 
	{
      Q45 q1 = new Q45();
      q1.a1=11;
      StringBuilder sb = new StringBuilder("Hello");
      Integer i = 10;
      doProduct(i);
      doString(sb);
      doProduct(q1.a1);
      System.out.println(i+" "+sb+" "+q1.a1);  
	}
}
