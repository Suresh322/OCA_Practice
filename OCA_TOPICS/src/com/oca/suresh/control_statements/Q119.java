package com.oca.suresh.control_statements;

public class Q119 
{
   public static void main(String[] args) 
	{
	  int wd = 0;
	  String days [] = {"sun","mon","wed","sat"};
	  for(String d:days)
	  {
		  switch (d)
		  {
		     case "sat":
		     case "sun":
		    	 wd=wd-1;
		    	 System.out.println(wd);
		    	 break;
		     case "mon":
		    	 wd++;
		    	 System.out.println(wd);
		     case "wed":
		    	 wd=wd+2;
		    	 System.out.println(wd);
		    	 
		    	 
		  }
	  }
	  
       
	}

}
