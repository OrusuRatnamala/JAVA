package com.infinite.lob;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Blob;



/**
 * @author ratnamalao
 *
 */
public class BlobOutputExample {
	
	public static void main(String[] args) {
			Connection on = null;
			FileOutputStream fout=null;
			Scanner sc = new Scanner(System.in);
			try {
				Class.forName("com.mysql.jdbc.Driver");// step1 loading the driver
				// Connection
				// on=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","mysql123@");//creating
				// connection
				on = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "mysql123@");// creating connection
				System.out.println("Connection established Successfully");
			
				PreparedStatement ps=on.prepareStatement("select * from imgtable");  
				ResultSet rs=ps.executeQuery();  
				if(rs.next()){//now on 1st row  

				Blob b=rs.getBlob(2);//2 means 2nd column data  
				byte barr[]=b.getBytes(1,(int)b.length());//1 means first image  

				fout=new FileOutputStream("d:\\sonoo.jpg");  
				fout.write(barr);  

				
				}
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
		fout.close();
	} 
	catch (Exception e) {
		System.out.println(e);
	}
}
}}
			