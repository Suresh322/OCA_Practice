package com.oca.suresh.arrays;

public class Q129 
{

	public static void main(String[] args) 
	{	
		int [] [] arr = new int[2] [4];
		arr[0]=new int [] {1,2,3,4};
		arr[1]=new int [] {1,2};
		
		for(int [] a:arr)
		{
		   for (int i=0;i<arr.length;i++)
		   {
			   System.out.print(a[i]+" ");
			   
		   }
		   System.out.println();
	   }  
   }

}
