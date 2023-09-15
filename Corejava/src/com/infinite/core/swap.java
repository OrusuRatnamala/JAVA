package com.infinite.core;


//@Ratnamala
//Swapping of 2 numbers without 3rd Variable
public class swap {
	public static void main(String a1[])
	{
		int a = 90;
		int b =190;
		System.out.println("a="+a);
		System.out.println("b="+b);
		b = (a + b) - (a = b);
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
