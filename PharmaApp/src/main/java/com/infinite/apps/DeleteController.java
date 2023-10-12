package com.infinite.apps;
	import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

	@Controller
	public class  DeleteController  {

		@RequestMapping("/delete")
		public String insert(HttpServletRequest request, HttpServletResponse response) {
			DataSource ds= DataSource1.getDataSource();
			Connection con = null;
			PreparedStatement ps = null;
			try{
			String Medicine = request.getParameter("Medicine");
			String Codeno = request.getParameter("Codeno");
			ps = con.prepareStatement("delete from medicine values(?,?)");
			ps.setString(1,Medicine);
			ps.setString(2,Codeno);
			int a=ps.executeUpdate();

		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "fail";
		}
	return "success";
	}
	}