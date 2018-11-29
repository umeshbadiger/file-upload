package com.sangeeta;

public class Select 
{
	Mobile m1 = new MobType();
	void select(int arg)
	{
		if(arg == 1)
		{
			System.out.println("you selected basic mobile");
			 m1.Basic();
		}
		
		else if(arg == 2)
		{
			System.out.println("you selected android mobile");
			m1.Android();
		}
		
		else if(arg == 3)
		{
			System.out.println("you selected ios mobile");
			m1.ios();
		}
	}

}
