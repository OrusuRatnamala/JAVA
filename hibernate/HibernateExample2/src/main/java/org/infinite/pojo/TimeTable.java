package org.infinite.pojo;

import java.sql.Timestamp;

public class TimeTable {
	private int ids;
	public int getIds() {
		return ids;
	}

	public void setIds(int ids) {
		this.ids = ids;
	}

	private String UserName;
	private String Password;
	private Timestamp Logintmp;

	public TimeTable() {
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public Timestamp getLogintmp() {
		return Logintmp;
	}

	public void setLogintmp(Timestamp logintmp) {
		Logintmp = logintmp;
	}

	
}
