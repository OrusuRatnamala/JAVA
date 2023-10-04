package com.infinite.account;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FundTransfer
 */
public class FundTransfer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection on = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FundTransfer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	//protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*int bal = Integer.parseInt(request.getParameter("amount"));
		int newbal = 0;
		try {
			on=ConToDB.initializeDatabase();
			PreparedStatement ps = on.prepareStatement("select balance from accounts1 where accountID=?");
			ps.setInt(1, Integer.valueOf(request.getParameter("accountID1")));
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				int availablebal = rs.getInt("balance");
				newbal = availablebal - bal;
				PreparedStatement ps2 = on.prepareStatement("update accounts1 set balance = ? where accountID=?");
				ps2.setInt(1, newbal);
				ps2.setInt(2, Integer.valueOf(request.getParameter("accountID1"))); 
				ps2.executeUpdate();
				ps2.close();
			}

			ps = on.prepareStatement("select balance from accounts1 where accountID=?");
			ps.setInt(1, Integer.valueOf(request.getParameter("accountID2")));
			ResultSet rs1 = ps.executeQuery();
			if (rs1.next()) {
				int balance = rs1.getInt("balance");
				newbal = balance + bal;
				PreparedStatement ps4 = on.prepareStatement("update accounts1 set balance=? where accountID=?");
				ps4.setInt(1, newbal);
				ps4.setInt(2, Integer.valueOf(request.getParameter("accountID2")));
				ps4.executeUpdate();
				ps4.close();
			}
			ps.close();
			response.sendRedirect("Success.html");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalStateException e) {
			System.out.println(e);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
					on.close();
				System.out.println("Connection closed");
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}*/



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int bal = Integer.parseInt(request.getParameter("amount"));
		int newbal = 0;
		try {
			on=ConToDB.initializeDatabase();
			PreparedStatement ps = on.prepareStatement("select balance from accounts1 where accountID=?");
			ps.setInt(1, Integer.valueOf(request.getParameter("accountID1")));
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				int availablebal = rs.getInt("balance");
				newbal = availablebal - bal;
				PreparedStatement ps2 = on.prepareStatement("update accounts1 set balance = ? where accountID=?");
				ps2.setInt(1, newbal);
				ps2.setInt(2, Integer.valueOf(request.getParameter("accountID1"))); 
				ps2.executeUpdate();
				ps2.close();
			}

			ps = on.prepareStatement("select balance from accounts1 where accountID=?");
			ps.setInt(1, Integer.valueOf(request.getParameter("accountID2")));
			ResultSet rs1 = ps.executeQuery();
			if (rs1.next()) {
				int balance = rs1.getInt("balance");
				newbal = balance + bal;
				PreparedStatement ps4 = on.prepareStatement("update accounts1 set balance=? where accountID=?");
				ps4.setInt(1, newbal);
				ps4.setInt(2, Integer.valueOf(request.getParameter("accountID2")));
				ps4.executeUpdate();
				ps4.close();
			}
			ps.close();
			response.sendRedirect("Success.html");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalStateException e) {
			System.out.println(e);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
					on.close();
				System.out.println("Connection closed");
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
