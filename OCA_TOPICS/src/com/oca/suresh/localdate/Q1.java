package com.oca.suresh.localdate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q1 
{

	public static void main(String[] args) 
	{
         String date = LocalDate.parse("2014-05-07").format(DateTimeFormatter.ISO_DATE_TIME);
         System.out.println(date);
         
	}

}
