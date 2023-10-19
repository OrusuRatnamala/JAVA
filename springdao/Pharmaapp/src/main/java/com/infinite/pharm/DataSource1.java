package com.infinite.pharm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class DataSource1 {
	private static DataSource datasource = null;

	public static DataSource getDataSource() {
		if (datasource == null) {
			HikariConfig config = new HikariConfig();
			config.setJdbcUrl("jdbc:mysql://localhost:3306/training");
			config.setUsername("root");
			config.setPassword("mysql123@");
			config.setMaximumPoolSize(10);
			config.setAutoCommit(true);
			config.addDataSourceProperty("cachePrepStmts ", "true");
			config.addDataSourceProperty("prepStmtCacheSize", "250");
			config.addDataSourceProperty("prepStmtCacheSqlLimit", "2045");
			datasource = new HikariDataSource(config);
		}
		return datasource;
	}

}
