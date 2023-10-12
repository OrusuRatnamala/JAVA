package com.infinite.web;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;

import com.zaxxer.hikari.HikariDataSource;

public class HikariDB {

	private static DataSource datasource = null;

	public static DataSource getDataSource() {

		if (datasource == null) {

			HikariConfig config = new HikariConfig();
			config.setDriverClassName("com.mysql.jdbc.Driver");

			config.setJdbcUrl("jdbc:mysql://localhost:3306/train");

			config.setUsername("root");

			config.setPassword("mysql123@");

			config.setMaximumPoolSize(10);

			config.setAutoCommit(true);

			config.addDataSourceProperty("cachePrepStmts", "true");

			config.addDataSourceProperty("prepStmtCacheSize", "250");

			config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

			datasource = new HikariDataSource(config);

		}

		return datasource;

	}

}