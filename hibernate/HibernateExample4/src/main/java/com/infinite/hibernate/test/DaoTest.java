package com.infinite.hibernate.test;

import java.util.Scanner;

import com.infinite.hibernate.diImpl.StudentImpl;

public class DaoTest {
	public static void main(String[] aargs) {

		StudentImpl s = new StudentImpl();
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Student Name");
		String name = s1.next();
		System.out.println("Enter Student RollNO:");
		String rollno = s1.next();
		System.out.println("Enter Student course");
		String course = s1.next();
		s.createRecord(name, rollno, course);

	}

}
