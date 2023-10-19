package com.infinite.Registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

/**
 * @author ratnamalao
 *
 */
public class DataSource1 {
	private static DataSource datasource = null;

	public static DataSource getDataSource() {
		if (datasource == null) {
			HikariConfig config = new HikariConfig();
			// config.setDriverClassName("com.mysql.jdbc.Driver");
			config.setJdbcUrl("jdbc:mysql://localhost:3306/week5");
			config.setUsername("root");
			config.setPassword("mysql123@");
			config.setAutoCommit(true);
			config.addDataSourceProperty("cachePrepStmts", "true");
			config.addDataSourceProperty("PrepStmtsCacheSize", "250");
			config.addDataSourceProperty("PrepStmtsCacheS1lLimit", "2048");
			datasource = new HikariDataSource(config);
		}
		return datasource;
	}
}
