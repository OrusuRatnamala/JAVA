package com.infinite.core;

public class stringexample2 {
	public static void main(String[] args)
	{
		String a="INFINITE";
		String b="infinite";
		
		System.out.println(a.length());
		String u=a.trim();
		System.out.println(u.indexOf(a));
		System.out.println(u.substring(0,3));
		System.out.println(a.equals(b.toUpperCase()));
		System.out.println(b.isEmpty());
	    System.out.println(a.lastIndexOf(a));
	    System.out.println(a.equals(a));
	    System.out.println(a.concat(a));
	    System.out.println(a.endsWith(a));
	    System.out.println(b.hashCode());
	    System.out.println(b.replaceAll(a,b));
	    
	}

}
