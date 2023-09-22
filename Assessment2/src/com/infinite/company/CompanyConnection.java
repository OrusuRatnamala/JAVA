package com.infinite.company;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


 

public class CompanyConnection {

	private static final Logger logger = Logger.getLogger(CompanyConnection.class);


	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		Connection on = null;
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.jdbc.Driver");// step1 loading the driver
			// Connection
			on = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "mysql123@");// creating
																											// connection
			PreparedStatement ps = on.prepareStatement("insert into company values(?,?,?,?,?)");//inserting values into databse
			logger.info("Enter companyname");
			ps.setString(1, sc.next());
			logger.info("Enter address");
			ps.setString(2, sc.next());
			logger.info("Enter country");
			ps.setString(3, sc.next());
			logger.info("no_of_employees");
			ps.setInt(4,sc.nextInt());
			logger.info("status");
			ps.setString(5, sc.next());

			int st = ps.executeUpdate();
			if (st == 1){
			
 

				logger.info("insert is sucussfull");}

 

			else

			{

				logger.info("insert is failed");
		}
		}
		catch (SQLException e1) {
			logger.info(e1);
		} catch (ClassNotFoundException e) {
			logger.info(e);
		} finally {

 

			try {
				on.close();
			} catch (Exception e) {
				logger.info(e);

 

			}
		}

 

	}
}