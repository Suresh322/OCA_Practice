package com.oca.suresh.boolean_;

public class Q38 
{

	public static void main(String[] args) 
	{
      int x = 100;
      int a = x++;  // 100
      int b = ++x;  // 101
      int c = x++;  // 101
      //int d = (a<b) ?  : (a<c) ?a:(b<c)?b:c;  --->CTE
      int d = (a<b) ? a : (a<c) ?(a+b):(b<c)?b:c;
      int e = (100<101)? 100:(100<101) ? (100+101):(101<101)?101:101;
      System.out.println(e);
      System.out.println(d);
      System.out.println("- - - - - ");
     
      System.out.println(c);
	}

}
