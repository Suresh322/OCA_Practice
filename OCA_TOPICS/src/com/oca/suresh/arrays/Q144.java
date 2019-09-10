package com.oca.suresh.arrays;

public class Q144 
{

	public static void main(String[] args) 
	{
		int arr [] [] = new int [1][3];
		for (int i=0;i<arr.length;i++)
		   {
			   for(int j= 0;j<arr[i].length;j++)
			   {
				   arr[i][j]=10;
				   System.out.println(arr[i][j]+" ");
				   System.out.println("-");
			   }
			   
		   }   

	}

}
