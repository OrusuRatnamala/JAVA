package com.infinite.log4jexample;

 

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

 

import com.infinite.security.JavaSecurity;

 

public class PropertiesExample {

 

	public static void main(String [] args)
	{
		// TODO Auto-generated method stub
		FileReader fr = null;
		Properties pr = null;
		try {
			fr = new FileReader("mysqldb.properties");
			pr = new Properties();
			pr.load(fr);
		} catch (Exception e1) {
			e1.printStackTrace();

 

		}
		try {
			Class.forName(pr.getProperty("drivername"));

 

		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();

 

		}
		Connection on = null;
		try {
			on = DriverManager.getConnection("jdbc:mysql://localhost:3306/training",
					JavaSecurity.decrypt(pr.getProperty("username"), "ratna"),
					JavaSecurity.decrypt(pr.getProperty("password"), "rat"));

 

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		System.out.println("Connection Established");
		try {
			on.close();

 

		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
}