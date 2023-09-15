package com.infinite.core;
import java.util.Arrays;
public class Stringexple {
	
	
	public static void main(String[] args)
	{
	String y[]={ "Monday" , "Tuesday ", "Wednesday" , "Thursday", "Friday" , "Saturday" , "Sunday" };
	String b = Arrays.toString(y);
	String e= b.toUpperCase();
	char t[]= e.toCharArray();
	int p= t.length -1;
	System.out.println(p);
	while(p >= 0)
	{
		System.out.print(t[p]);
		p--;
		
	}
	}

}
