package com.oca.suresh.typecasting_wrapper;

public class Q92 {

	public static void main(String[] args) 
	{
		double discount=0;
		int  qty = Integer.parseInt("85");
		
	   //discount = (qty>=90) ? 0.5 :(qty>80) ? 0.2 : 0; 
		
		if(qty>=90)
		{
			discount=0.5;
		}
		if(qty>=80)
		{
			discount=0.2;
		}
	   
	   System.out.println(discount);
		
		
		
		
	}

}
