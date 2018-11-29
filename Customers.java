package com.sangeeta;
import java.util.Scanner;

public class Customers
{
	public static void main(String[] args)
	{
		Select s1 = new Select();
		Scanner scn = new Scanner(System.in);
		System.out.println("for basic mobile enter1");
		System.out.println("for android  enter2");
		System.out.println("for ios enter3");

		
		int x = scn.nextInt();
     
		switch(x)
		{
		case 1: s1.select(1);
		break;
		
		case 2: s1.select(2);
		break;
		
		case 3:s1.select(3);
		break;
		
			
		}
		
	}
	
			
			
	
}
