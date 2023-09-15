package com.infinite.lob;

import java.io.FileInputStream;
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
public class BlobInputExample {
	
	public static void main(String[] args) {
			Connection on = null;
			Scanner sc = new Scanner(System.in);
			try {
				Class.forName("com.mysql.jdbc.Driver");// step1 loading the driver
				// Connection
				// on=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","mysql123@");//creating
				// connection
				on = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "mysql123@");// creating connection
				System.out.println("Connection established Successfully");
			
				PreparedStatement ps=on.prepareStatement("insert into imgtable values(?,?)");  

				ps.setString(1,"sonoo");  


				FileInputStream fin=new FileInputStream("images/image1.png");  

				ps.setBinaryStream(2,fin,fin.available());  

				int i=ps.executeUpdate();  

				System.out.println(i+" records affected");
			}
		catch (SQLException e1) {
	System.out.println(e1);
}
        catch (Exception e) {
	System.out.println(e);
}
			finally {
	try 
	{
		on.close();
	} 
	catch (Exception e) {
		System.out.println(e);
	}
}
}
}