package com.infinite.pharm;

import java.io.IOException;
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
public class DisplayController {

	@RequestMapping("/display")
	public String display(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		try {
			DataSource dataSource = DataSource1.getDataSource();
			con = dataSource.getConnection();
			String medicines = request.getParameter("medicines");
			ps = con.prepareStatement("SELECT * FROM phrma");
		    rs =ps.executeQuery();
			while(rs.next()) {
				response.getWriter().println(rs.getString(1)+" "+rs.getString(2)+"  "+rs.getInt(3)+" "+rs.getInt(4));				
			} 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
