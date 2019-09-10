package com.oca.suresh.localdate;

import java.time.LocalDate;

public class Q145 
{

	public static void main(String[] args) 
	{
      LocalDate date = LocalDate.of(2012, 1, 30);
      LocalDate day=date.plusDays(10);
      System.out.println(date);
      System.out.println(day);
      
	}

}
