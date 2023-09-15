package com.infinite.jdbc;

 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

 

public class JdbcDynamic {

 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection on=null;
		Scanner sc = new Scanner(System.in);
		try
		{
			Class.forName(args[0]);  //step-1--loading the driver
			on=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","mysql123@");  //step-2--Establishing the connection
			System.out.println("Connection"+" Established");
			PreparedStatement ps= on.prepareStatement("insert into employee values(?,?,?)");
			System.out.println("Enter fullname:");
			ps.setString(1, sc.next());
			System.out.println("Enter Idno:");
			ps.setInt(2, sc.nextInt());
			System.out.println("Enter department");
			String r = sc.next();
			if(r.length()==1)
			{
				ps.setString(3, r);
				int status=ps.executeUpdate();
				if(status==1)
					System.out.println("Record inserted successfully");
				else
					System.out.println("Record failed");

			}
			else
			{	System.out.println("Invalid input.Please give character");

			}
		}
		catch(SQLException e1)
		{
			System.out.println(e1);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		finally
		{
			try
			{
				on.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
