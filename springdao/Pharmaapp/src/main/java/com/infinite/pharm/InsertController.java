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
public class InsertController {

	@RequestMapping("/insert")
	public String insert(HttpServletRequest request, HttpServletResponse response) {
		// DataSource ds = DataSource1.getDataSource();
		Connection con = null;
		PreparedStatement ps = null;

		try {
			DataSource dataSource = DataSource1.getDataSource();
			con = dataSource.getConnection();
			String medicine = request.getParameter("medicine");
			String expirydate = request.getParameter("expirydate");
			String cost = request.getParameter("cost");
			String codeno = request.getParameter("codeno");
			ps = con.prepareStatement("insert into pharma values(?,?,?,?)");
			ps.setString(1, medicine);
			ps.setString(2, expirydate);
			ps.setString(3, cost);
			ps.setString(4, codeno);
			int a = ps.executeUpdate();
			if (a != 0) {
				return "success";
			} else {
				return "fail";
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return null;

	}
}