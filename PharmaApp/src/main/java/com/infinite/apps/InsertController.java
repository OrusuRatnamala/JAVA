package com.infinite.apps;

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
		//DataSource ds = DataSource1.getDataSource();
		Connection con = null;
		PreparedStatement ps = null;
		try {
			DataSource ds = DataSource1.getDataSource();
			con = ds.getConnection();
			String Medicine = request.getParameter("Medicine");
			String Expirydate = request.getParameter("Expirydate");
			String Cost = request.getParameter("Cost");
			String Quality = request.getParameter("Quality");
			String Codeno = request.getParameter("Codeno");
			ps = con.prepareStatement("insert into medicine values(?,?,?,?,?)");
			ps.setString(1, Medicine);
			ps.setString(2, Expirydate);
			ps.setString(3, Cost);
			ps.setString(4, Quality);
			ps.setString(5, Codeno);
			int a = ps.executeUpdate();
			if(a!=0){
				return "success";
			}
			else{
				return "fail";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
					}
		return null;
	}
}
