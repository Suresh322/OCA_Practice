package com.oca.suresh.constructor_this_super;

class CheckingAccount
{
	public int amount;
//	public CheckingAccount()
//	{
//		this.amount=100;
//	}
	public CheckingAccount()
	{
		amount=100;
	}
	
	
	
}
public class Q58 
{

	public static void main(String[] args) 
	{
		CheckingAccount acc = new CheckingAccount();
//		int b = acc.amount=200;
//		System.out.println(b);
		System.out.println(acc.amount);


	}

}

