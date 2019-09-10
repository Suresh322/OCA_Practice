package com.oca.suresh.typecasting_wrapper;

public class Q107 
{
	public static void main(String[] args) 
	{
        Short s1 = 200;
        Integer s2 = 400;
        Long s3 = (long)s1+s2;
        //String s4 =(String)(s3+s2); 
        System.out.println("Sum is "+ s2 + s1+s3);
        System.out.println(s1+s3);
        
        
	}

}
