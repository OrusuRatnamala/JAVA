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
public class TrainDetails {
	@RequestMapping("/details")
	public String details(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Connection con = null;
		PreparedStatement ps1 = null;
		ResultSet rs = null;
		String source = request.getParameter("source");
		String destination = request.getParameter("destination");
		System.out.println(source);
		System.out.println(destination);
		System.out.println("details");
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			DataSource datasource = HikariDB.getDataSource();
			con = datasource.getConnection();
			ps1 = con.prepareStatement("select * from TrainDetails");
			// ps.setString(1,source);
			// ps.setString(2,destination);
			rs = ps1.executeQuery();
			out.println("<html><body>");
			out.println("<h3>Train Details<h3>");
			out.println("<table border=1>" + "<tr>" + "<td><b>" + "Trainno" + "</b></td>" + "<td><b>" + "Trainname"
					+ "</b></td>" + "<td><b>" + "Source" + "</b></td>" + "<td><b>" + "Destination" + "</b></td>"
					+ "<td><b>" + "StartTime" + "</b></td>" + "<td><b>" + "EndTime" + "</b></td>" + "</tr>");
			while (rs.next()) {
				System.out.println("1");
				if (rs.getString(4).equalsIgnoreCase(destination)) {
					System.out.println("2");
					if (rs.getString(3).equalsIgnoreCase(source)) {
						System.out.println("3");
						PreparedStatement ps2 = con
								.prepareStatement("select * from TrainDetails where source=? and destination=?");
						ps2.setString(1, source);
						ps2.setString(2, destination);
						ResultSet rss = ps2.executeQuery();
						if (rss.next()) {
							while (rss.next()) {
								System.out.println("IF");
								out.println("<tr>" + "<td>" + rss.getString(1) + "</td>" + "<td>" + rss.getString(2)
										+ "</td>" + "<td>" + rss.getString(3) + "</td>" + "<td>" + rss.getString(4)
										+ "</td>" + "<td>" + rss.getString(8) + "</td>" + "<td>" + rss.getString(6)
										+ "</td>" + "</tr>");
							}
						}
						out.println("</body></html>");
					} else if (rs.getString(5).equalsIgnoreCase(source)) {
						System.out.println("4");
						PreparedStatement ps3 = con
								.prepareStatement("select * from trainDetails where via=? and destination=?");
						ps3.setString(1, source);
						ps3.setString(2, destination);
						ResultSet rsv = ps3.executeQuery();
						if (rsv.next()) {
							System.out.println("5");
							while (rsv != null) {
								System.out.println("IF");
								out.println("<tr>" + "<td>" + rsv.getString(1) + "</td>" + "<td>" + rsv.getString(2)
										+ "</td>" + "<td>" + rsv.getString(5) + "</td>" + "<td>" + rsv.getString(4)
										+ "</td>" + "<td>" + rsv.getString(8) + "</td>" + "<td>" + rsv.getString(6)
										+ "</td>" + "</tr>");
							}
						}
						out.println("</body></html>");
					}
				}

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
