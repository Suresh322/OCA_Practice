package com.oca.suresh.strings;

public class Q131 
{

	public static void main(String[] args) 
	{
		String k = "";
      String [] s = new String[2];
//      int i = 0;
      for(String str: s)
      {
    	  System.out.println(str);
      }
      System.out.println("_ _ _ _ _ _ _ _ ");
      
      for (int n=0 ;n<s.length;n++)
      {
    	  System.out.println(s[n].concat(k));//(if any operations does with default values result will be null pointer exceptions)
      }
	}

}
