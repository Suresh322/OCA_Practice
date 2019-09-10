package com.oca.suresh.arrays;

public class Q8 {

	public static void main(String[] args) 
	{
		
		String s[] []  = new String[2] [2];
		s [0][0] = "R";
		s [0][1] = "B";
		s [1][0] = "S";
		s [1][1] = "L";
		
		int n =2 ;
		
		for (int i = 0; i<n;++i)
		{
			for (int j = 0; j<n;++j)
			{
				System.out.print(s[i][j]+" : ");
			}
		}

	}

}
