package com.infinite.pharm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginValid {

	@RequestMapping("/valid")
	public String display(HttpServletRequest request, HttpServletResponse response) {
		DataSource ds = DataSource1.getDataSource();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			DataSource dataSource = DataSource1.getDataSource();
			con = dataSource.getConnection();
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			ps = con.prepareStatement("select * from login where username=? and password=?");
			// System.out.println(""+con.getClass());
			ps.setString(1, username);
			ps.setString(2, password);
			rs = ps.executeQuery();
			if (rs.next()) {
				return "home";
			} else {
				return "fail";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				con.close();
				System.out.println("Connection closed");
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		return null;
	}

}
