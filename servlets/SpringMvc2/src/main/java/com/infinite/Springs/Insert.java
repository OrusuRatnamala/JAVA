package com.infinite.Springs;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * @author ratnamalao
 *
 */
public class Insert
{
	private static final Logger logger = Logger.getLogger(Insert.class);
	
	
public static void main(String[] args)  {
	PropertyConfigurator.configure("log4j.properties");
	try{	
	Class.forName("com.mysql.jdbc.Driver");//step1 loading the driver
    Connection on=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","mysql123@");//creating connection
	Statement stat =on.createStatement();//creating statement
	stat.executeUpdate("Insert into lenovo Values(('vesion1','Dell','2023-09-23',60000)");
	logger.info("Insert row from lenovo table");
	on.close();//closing
}
	catch(SQLException e1)
	{
		logger.info(e1);
	}
	catch(Exception e)
	{
		logger.info(e);
	}
}
}
