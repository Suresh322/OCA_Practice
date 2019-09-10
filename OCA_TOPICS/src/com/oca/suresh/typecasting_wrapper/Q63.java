package com.oca.suresh.typecasting_wrapper;

public class Q63 {

	public static void main(String[] args) 
	{
		Boolean [] b = new Boolean[3];
		
		 b[0] = new Boolean(Boolean.parseBoolean("True"));
		
		// b[0] = new Boolean(Boolean.parseBoolean("true"));
		 
		 b[1]= new Boolean(null);
		 
		 System.out.println(b[0]+ " " +b[1]+ " " +b[2]);

	}

}
