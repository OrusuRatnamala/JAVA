package com.infinite.account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConToDB {
	protected static Connection initializeDatabase() throws SQLException,ClassNotFoundException
	{
		String Driver = "com.mysql.jdbc.Driver";
		String url = "Jdbc:mysql://localhost:3306/wallet";
		String Username = "root";
		String Password = "mysql123@";
		Class.forName(Driver);
		Connection on = DriverManager.getConnection(url,Username,Password);
		return on;
	}
}
