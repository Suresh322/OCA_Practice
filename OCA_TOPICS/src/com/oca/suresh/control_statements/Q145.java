package com.oca.suresh.control_statements;

public class Q145 {

	public static void main(String[] args) 
	{
       String [] n = {"1","2","3","4"};
       for (int i=0;i<n.length;i++)
	   {
    	   System.out.println(n[i]);
    	   if(n[i].equals("4"))
    	   {
    		   System.out.println("WORK DONE");
    		   break;
    	   }
    	   continue;
	   }
	}

}
