package com.infinite.Registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.HttpServerErrorException;
import java.sql.SQLException;
import javax.sql.DataSource;
import java.sql.SQLClientInfoException;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import com.zaxxer.hikari.util.DriverDataSource;

/**
 * @author ratnamalao
 *
 */
@Controller // annotation
public class LoginValid {
	private static final Logger logger = Logger.getLogger(LoginValid.class);

	@RequestMapping("/valid")
	public String login() {
		PropertyConfigurator.configure("log4j.properties");
		logger.info("login");
		return "index";
	}

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public String registor(HttpServletRequest request, HttpServletResponse response) {
		java.sql.Connection con = null;
		java.sql.PreparedStatement ps = null;
		ResultSet rs = null;
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String date = request.getParameter("date");
		String gender = request.getParameter("gender");
		// String female = request.getParameter("female");
		String Profession = request.getParameter("Profession");
		String married = request.getParameter("married");
		String note = request.getParameter("note");
		// System.out.println(date+""+male+""+female+""+Profession+""+married);
		try {
			DataSource dataSource = DataSource1.getDataSource();
			con = dataSource.getConnection();
			ps = con.prepareStatement("insert into registration values(?,?,?,?,?,?,?,?)");// inserting
			// the
			// data.
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, password);
			ps.setString(4, date);
			ps.setString(5, gender);
			ps.setString(6, Profession);
			ps.setString(7, married);
			ps.setString(8, note);
			int x = ps.executeUpdate();
			if (x != 0) {
				return "success";
			} else {
				return "fail";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				con.close();
				logger.info("Connection closed");// closed
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		logger.info("registration");
		return "fail";
	}
}
