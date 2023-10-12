package com.infinite.web;

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
public class login {

	@RequestMapping("/login")
	public String login(HttpServletRequest request, HttpServletResponse response) {
		Connection con = null;
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		try {
			DataSource datasource = HikariDB.getDataSource();
			con = datasource.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from User where username=? and password=?");
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {

				return "welcome";
			} else {
				return "invalid";
			}

		} catch (SQLException e) {
			System.out.println(e);
		} catch (Exception e1) {
			System.out.println(e1);
		}
		return "invalid";
	}
}