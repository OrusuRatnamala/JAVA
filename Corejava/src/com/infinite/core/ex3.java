package com.infinite.core;

public class ex3 {
	//design a program for swapping ,2table.
	//displaying all alphabets using functions.
	
	public static void SwappingE() 
	{
		int a=90;
		int b=89;
		a=a+b-(b+a);
		System.out.println(a);
		System.out.println(b);
		
	}
	public static void displaytable(int a)
	{
		int j=0;
		while(j<=10)
		{
			System.out.println(a + "*" + j + "=" + a * j);
			j++;
		}
	}
	public static void displayalphabets() {}
	
	
	public static void main(String...a)
	{
		displaytable(89);
		//SwappingE();
		ex3 op=new ex3();
		op.SwappingE();
	
	}
}
