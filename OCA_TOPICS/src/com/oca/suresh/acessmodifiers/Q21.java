package com.oca.suresh.acessmodifiers;

public class Q21 
 {
    private char var;
    
	public static void main(String[] args) 
	{
      char var1='a';
      char var2=var1;
      var2='e';
      
      Q21 q1 = new Q21();
      
      Q21 q2 = new Q21();
      q1.var='i';
      q2.var='o';
      System.out.println(var1+ " "+var2);
      System.out.println(q1.var+ " "+q2.var);
      
	}

}

