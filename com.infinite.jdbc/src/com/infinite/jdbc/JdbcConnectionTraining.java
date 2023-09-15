package com.infinite.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @author ratnamalao
 *
 */
public class JdbcConnectionTraining {
	public static void main(String[] args) {
		Connection on = null;
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.jdbc.Driver");// step1 loading the driver
			// Connection
			// on=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","mysql123@");//creating
			// connection
			on = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "mysql123@");// creating
																											// connection
			System.out.println("Connection established Successfully");
			PreparedStatement ps = on.prepareStatement("insert into employee Values(?,?,?)");
			System.out.println("Enter Fullname");
			ps.setString(1, sc.next());
			System.out.println("ENter IDno");
			ps.setInt(2, sc.nextInt());
			System.out.println("Enter Department");
			ps.setString(3, sc.next());
			int status = ps.executeUpdate(); // return1
			if (status == 1)
				System.out.println("Record insert successfully");
			else
				System.out.println("Record failed");
		}

		/*
		 * Statement stmt =on.createStatement();//creating statement /ResultSet
		 * st=stmt.executeQuery("select*from employee"); while(st.next()) {
		 * System.out.println(st.getString(1));
		 * System.out.println(st.getInt(2));
		 * 
		 * } //on.close();//closing }
		 */
		catch (SQLException e1) {
			System.out.println(e1);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} finally {
			try {
				on.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
