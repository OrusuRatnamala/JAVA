package com.infinite.jdbc;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;


	/**
	 * @author ratnamalao
	 *
	 */
	public class JdbcDelete
	{
	public static void main(String[] args)  {
		Connection on=null;
		try{	
		Class.forName("com.mysql.jdbc.Driver");//step1 loading the driver
	    //Connection on=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","mysql123@");//creating connection
		on=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","mysql123@");//creating connection
		Statement stat =on.createStatement();//creating statement
		stat.executeUpdate("Delete from employee where idno='890'");
		System.out.println("Deleted row from employee table");
		//on.close();//closing
	}
		catch(SQLException e1){
			System.out.println(e1);
		}
		catch (ClassNotFoundException e)
		{
			System.out.println(e);
		}
		finally
		{
			try{
				on.close();
			}
		catch(Exception e)
		{
			System.out.println(e);
			}
		}
	}
	}
	
	
