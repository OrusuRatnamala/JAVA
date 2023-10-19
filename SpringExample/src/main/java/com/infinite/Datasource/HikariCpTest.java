package com.infinite.Datasource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class HikariCpTest {
	private static HikariDataSource datasource = null;

	public static DataSource getDataSource() {
		if (datasource == null) {
			HikariConfig config = new HikariConfig();
			config.setJdbcUrl("jdbc:mysql://localhost:3306/training");
			config.setUsername("root");
			config.setPassword("mysql123@");
			config.setMaximumPoolSize(10);
			config.setAutoCommit(false);
			config.addDataSourceProperty("cachePrepStmts", "true");
			config.addDataSourceProperty("prepStmtCacheSize", "250");
			config.addDataSourceProperty("prepStmtCacheSize", "2048");
			datasource = new HikariDataSource(config);
		}
		return datasource;
	}

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet resultSet = null;
		try {
			DataSource dataSource = HikariCpTest.getDataSource();
			connection = (dataSource).getConnection();
			pstmt = connection.prepareStatement("SELECT * FROM book");

			System.out.println("the connection object is of class:" + connection.getClass());
			resultSet = pstmt.executeQuery();
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1) + "," + resultSet.getString(2));
			}

		} catch (Exception e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				{
					e1.printStackTrace();

				}
				e.printStackTrace();

			}
		}

	}

}
