package com.infinite.web;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Train {
	Connection on = null;
	PreparedStatement ps = null;

	@RequestMapping(value = "/create")
	public String create() {
		return "create";

	}

	// register mapper get's called for data insertion
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String pass = request.getParameter("password");
		// String gender=request.getParameter("gender");

		try {
			DataSource datasource = HikariDB.getDataSource(); // data source
																// connection
			on = datasource.getConnection();
			ps = on.prepareStatement("insert into User values(?,?,?)"); // for
																		// insertion
																		// of
																		// data
			ps.setString(1, name);
			ps.setString(2, pass);
			ps.setString(3, email);
			// ps.setString(4,gender);
			System.out.println("it is here");
			int x = ps.executeUpdate();
			if (x != 0) {
				return "create";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "invalid";
	}
}