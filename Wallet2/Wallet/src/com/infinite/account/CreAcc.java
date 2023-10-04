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
 * Servlet implementation class CreAcc
 */
public class CreAcc extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection on = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreAcc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	//protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*try{
			//ServletConfig cg = getServletConfig();
			//on=ConToDB.initializeDatabase();
			Class.forName("com.mysql.jdbc.Driver");
			on = DriverManager.getConnection("jdbc:mysql://localhost:3306/wallet", "root", "mysql123@");
			//Statement st=on.createStatement();
			//Scanner s=new Scanner(System.in);
			PreparedStatement ps=on.prepareStatement("Insert into accounts1 values(?,?,?,?);");
			ps.setInt(1,Integer.valueOf(request.getParameter("accountid")));
			ps.setString(2,request.getParameter("username"));
			ps.setString(3,request.getParameter("password"));
			//ps.setInt(3,Integer.valueOf(request.getParameter("accountid")));
			ps.setInt(4,Integer.valueOf(request.getParameter("balance")));
		
			ps.executeUpdate();
			ps.close();
			response.sendRedirect("Combine.jsp");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try{
				on.close();
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
		}
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection con = null;
		ResultSet rs = null;
		//servlet for creating an account.
		try {
			con = ConToDB.initializeDatabase();
			int a = Integer.valueOf(request.getParameter("accountID"));
			PreparedStatement ps1 = con.prepareStatement("select accountID from accounts where accountID=?");
			ps1.setInt(1, a);
			rs = ps1.executeQuery();
			while(rs.next()) {
				int aid = rs.getInt("accountID");
				// if account already exists.
				if (aid == a) 
					response.getWriter().print("" + "<html>" + "<body bgcolor='Bisque'>" + "<center>"
							+ "<h1>Account ID already exists!</h1><br>" + "<form action='button.html'>"
							+ "<input type='submit' value='OK'>" + "</form>" + "</center>" + "</boby>" + "</html>");

			}
				
					PreparedStatement ps2 = con.prepareStatement("insert into accounts1 values(?,?,?,?)");
					ps2.setInt(1,a);
					ps2.setString(2, request.getParameter("username"));
					ps2.setString(3, request.getParameter("password"));
					ps2.setFloat(4,(float)0.0);
					ps2.executeUpdate();
					int status=ps2.executeUpdate();
					if (status == 1) {
						response.sendRedirect("Firstpage.html");
					}
					else {
						//response.sendRedirect("Failure.html");
					
//						response.getWriter().print("" + "<html>" + "<body bgcolor='Bisque'>" + "<center>"
//								+ "<h1>Account created successfully!!</h1><br>" + "<form action='button.html'>"
//								+ "<input type='submit' value='OK'>" + "</form>" + "</center>" + "</boby>" + "</html>");
					}	
				
			
		} catch (SQLException e) {
			System.out.println(e);
	
		}
		catch (Exception e1)
		{
			System.out.println(e1);
		}
		finally {
			try {
				con.close();
			} catch (Exception e) {
				System.out.print(e);
			}
		}
	}

}

