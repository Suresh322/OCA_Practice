package com.oca.suresh.arrays;

public class Q93 {

	public static void main(String[] args) 
	{
       int [] arr = { 15 , 30 , 45 , 60 ,75};
       arr[2]=arr[4];
       arr[4]=90;
       
       for (int ann:arr) 
       {
    	   System.out.print(" | "+ann);
       }
    		   
	}

}
