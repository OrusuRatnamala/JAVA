
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
public class JdbcInsert
{
public static void main(String[] args)  {
	try{	
	Class.forName("com.mysql.jdbc.Driver");//step1 loading the driver
    Connection on=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","mysql123@");//creating connection
	Statement stat =on.createStatement();//creating statement
	stat.executeUpdate("Insert into employee Values('jaya','103','software')");
	System.out.println("Insert row from employee table");
	on.close();//closing
}
	catch(SQLException e1){
		System.out.println(e1);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
