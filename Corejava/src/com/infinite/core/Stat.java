package com.infinite.core;

 

class Stat {

 

	int a;
	String name1;

 

	Stat() {//empty constructor
		a = 90;

		return;

 

	}
	Stat(String name) {//empty constructor
		this.name1=name;
	}
	Stat(String uname,int q) {//empty constructor

	}

 

	// named blocks
	public void display() {
		System.out.println(name1);
	}

 

	// unnamed block
	{
		System.out.println("Unnamed Blocks");
	}

 

	// static block
	static {
		System.out.println("static Blocks");
	}
}

 

public class StaticExample2 {

 

	public static void main(String[] args) {

 

		Stat ref = new Stat("srinivas");// object
		ref.display();
		Stat ref1 = new Stat();
		System.out.println(ref1.a);

 

	}

 

}
