package com.oca.suresh.strings;

public class Q86 
{
	static int i = 100;
    int j=200;
    public String toString()
    {
  	  return j+" "+i;
  	  
    }
	public static void main(String[] args) 
	{
		Q86 q1 = new Q86();
		q1.j=300;
		System.out.println(q1);
		Q86 q2 = new Q86();
		q2.i=300;
		System.out.println(q2);
		
      
	}

}
