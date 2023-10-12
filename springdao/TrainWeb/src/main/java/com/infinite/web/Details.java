package com.infinite.web;

import java.io.IOException;
import java.io.PrintWriter;
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
public class Details {
	@RequestMapping(value = "/traindetails")
	public String traindetails(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			DataSource datasource = HikariDB.getDataSource();
			con = datasource.getConnection();
			ps = con.prepareStatement("select * from TrainDetails where trainno=?");
			ps.setInt(1, Integer.parseInt(request.getParameter("trainno")));
			out.println("<html><body>");
			out.println("<h3>Train Details<h3>");
			out.println("<table border=1>" + "<tr>" + "<td><b>" + "Trainno" + "</b></td>" + "<td><b>" + "Trainname"
					+ "</b></td>" + "<td><b>" + "Source" + "</b></td>" + "<td><b>" + "Destination" + "</b></td>"
					+ "<td><b>" + "StartTime" + "</b></td>" + "<td><b>" + "EndTime" + "</b></td>" + "</tr>");
			rs = ps.executeQuery();
			while (rs.next()) {
				// out.println(rs.getInt(1)+"<br>"+rs.getString(2)+"<br>"+rs.getString(3));
				out.println("<tr>" + "<td>" + rs.getString(1) + "</td>" + "<td>" + rs.getString(2) + "</td>" + "<td>"
						+ rs.getString(3) + "</td>" + "<td>" + rs.getString(4) + "</td>" + "<td>" + rs.getString(6)
						+ "</td>" + "<td>" + rs.getString(7) + "</td>" + "</tr>");
				// i++;
				// +"<td>" + rs.getString(2) + "</td>" +"<td>" + rs.getInt(3) +
				// "</td>"+"<td>" + rs.getInt(4) + "</td>" +"<td>" +
				// rs.getInt(5) + "</td>"
			}
			out.println("</body></html>");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// con.rollback();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;

	}

}