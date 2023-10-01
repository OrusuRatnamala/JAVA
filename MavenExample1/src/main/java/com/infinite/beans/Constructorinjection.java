package com.infinite.beans;

public class Constructorinjection {
	
		private String first;
		private int idname;
		private String y;
public void beaninit()
{
	System.out.println("Beans init called");
}
public void beandestroy(){
	System.out.println("Beans destroy called");
}
	 
		Constructorinjection() {

		}

		Constructorinjection(String firstname, int ids) {

	
			this.first = firstname;
			this.idname = ids;

	 

		}

	 

		Constructorinjection(int id, String firstname, String y) {
			this.idname = id;
			this.first = firstname;
			this.y = y;
		}

	 

		public void displayName() {
			System.out.println(idname + "" + first + y);

	 

		}

	 

	}


	


