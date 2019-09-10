package com.oca.suresh.constructor_this_super;
class CheckAccount
{
	public int amount;
	public CheckAccount(int amount)
	{
		this.amount = amount;
	}
	public int getAmount()
	{
		return amount;
	}
	public void changeAmount(int x)
	{
		amount += x;
	}
	
}
public class Q40 
{

	public static void main(String[] args) 
	{
		CheckAccount acc = new CheckAccount((int)(Math.random()*1000));
		acc.amount=0;
		acc.changeAmount(-acc.amount);
		//acc.changeAmount(-acc.getAmount());
		System.out.println(acc.getAmount());

	}

}
