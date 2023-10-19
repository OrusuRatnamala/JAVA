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
public class DeleteController {

	@RequestMapping("/delete")
	public String delete(HttpServletRequest request, HttpServletResponse response) {
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		try {
			DataSource dataSource = DataSource1.getDataSource();
			con = dataSource.getConnection();
			String codeno = request.getParameter("codeno");
			ps = con.prepareStatement("delete from pharma where codeno=?");
			ps.setString(1, codeno);
			int x = ps.executeUpdate();
			if (x != 0) {

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