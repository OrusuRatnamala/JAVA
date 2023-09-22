package com.infinite.company;

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
public class Company
{
	private static final Logger logger = Logger.getLogger(Company.class);
	
	
public static void main(String[] args)  {
	PropertyConfigurator.configure("log4j.properties");
	try{	
	Class.forName("com.mysql.jdbc.Driver");//step1 loading the driver
    Connection on=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","mysql123@");//creating connection
	Statement stat =on.createStatement();//creating statement
	stat.executeUpdate("Insert into company Values('infinite','hill 3','india','10551','active')");
	logger.info("Insert row from company table");
	on.close();//closing
}
	catch(SQLException e1){
		logger.info(e1);
	}
	catch(Exception e)
	{
		logger.info(e);
	}
}
}
