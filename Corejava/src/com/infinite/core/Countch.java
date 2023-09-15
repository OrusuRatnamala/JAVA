package com.infinite.core;

import java.util.Scanner;

public class Countch
{
	public static void main(String [] args){
		
	String st="Returns the index within this string of the first occurrence";
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a character:");
	char ch=sc.next().charAt(0);
	int c=0;
	for(int i=0;i<st.length();i++)
	{
		if(st.charAt(i)==ch)
			c++;
		
	}
	System.out.print("number of "+ch+" letters is "+c);
	

}
}