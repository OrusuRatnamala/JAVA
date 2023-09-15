package com.infinite.core;

public class WhileExample1 {
	
	
	public static void main(String...a)
	{
		
		
		int j = 10;//start
		while(j<100)
		{
			if(j==60)
			{
				j=j+10;
				continue;
			}
			System.out.println(j+ "");
			j=j+10;
		}
	/*
		int j1=4;
		while(j1>=1)
		{
			System.out.println(j1+"");
			j1--;
		}
	*/
	}


}
