package com.infinite.SpringBootMvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Municipal")
public class Municipal {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "Name")
	private String name;

	@Column(name = "Date")
	private String date;

	@Column(name = "Address")
	private String address;

	@Column(name = "Mobile")
	private String mobile;

	@Column(name = "Email")
	private String email;

	@Column(name = "Complain")
	private String complain;

	@Column(name = "Ward_number")
	private String wardnum;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setModile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}
}
