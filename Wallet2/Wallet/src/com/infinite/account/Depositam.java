package com.infinite.account;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Deposit
 */
public class Depositam extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con = null;
	Scanner sc = new Scanner(System.in);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Depositam() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int am = Integer.parseInt(request.getParameter("amount"));
		int newbal = 0;
		PreparedStatement ps=null;
		PreparedStatement ps2=null;
		try {
			con=ConToDB.initializeDatabase();
			ps = con.prepareStatement("select Balance from accounts1 where accountId=?");
			ps.setInt(1, Integer.valueOf(request.getParameter("accountId")));
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				int balance = rs.getInt("Balance");
				newbal = balance + am;
				ps2 = con.prepareStatement("update accounts1 set Balance=? where accountId=?");
				ps2.setInt(1, newbal);
				ps2.setString(2, request.getParameter("accountId"));
				ps2.executeUpdate();
			}
			response.sendRedirect("Success.html");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally{
			try{
				con.close();
				ps.close();
				ps2.close();
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
		}
    }
}
