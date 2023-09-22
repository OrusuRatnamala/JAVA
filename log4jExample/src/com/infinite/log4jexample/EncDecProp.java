package com.infinite.log4jexample;

import com.infinite.security.JavaSecurity;

public class EncDecProp {
	public static void main(String[] args) {
		//System.out.println(JavaSecurity.encrypt("root", "ratna"));
		//System.out.println(JavaSecurity.decrypt("VSnHk+9rmuHesQ7D0XMYuw==", "ratna"));
		System.out.println(JavaSecurity.encrypt("mysql123@", "rat"));
	//	System.out.println(JavaSecurity.decrypt("E+xeVBORKt+urINpeIJdUg==", "rat"));

	}

}
