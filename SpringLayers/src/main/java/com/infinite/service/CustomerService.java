package com.infinite.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.infinite.dao.DaoExample;

@Service

public class CustomerService {
	@Autowired
	DaoExample Daoexample;

	public void display() {
		System.out.println("customer service activated");
	}

}    




