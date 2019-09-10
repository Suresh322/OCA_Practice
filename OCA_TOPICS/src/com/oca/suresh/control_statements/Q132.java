package com.oca.suresh.control_statements;

class Alpha
{
	int ns;
	static int s;
	Alpha(int ns)
	{
		if(s<ns)
		{
			s=ns;
			this.ns=ns;		
		}
	}
	void print()
	{
		System.out.println("NS="+ns+" | S="+s);
	}
}
public class Q132 
{
   public static void main(String[] args) 
	{
		Alpha a1 = new Alpha(50);
		Alpha a2 = new Alpha(120);
		Alpha a3 = new Alpha(100);
		a1.print();
		a2.print();
		a3.print();
	}
}
