package com.infinite.core;

class A{
	
	public void display()
	{
		System.out.println("A");
		
	}

}
class B extends A
{
	public void display()
	{
		super.display();
		System.out.println("B");
     }
}

public class OverridingExample
{
	public static void main(String [] args)
	{
		B obj=new B();
		obj.display();
	}
	
	}


	
	