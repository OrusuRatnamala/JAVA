package com.infinite.SpringbootMvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infinite.SpringbootMvc.model.Customer;
import com.infinite.SpringbootMvc.repository.CustomerDaoImpl;

@Service
public class CustomerServiceImpl implements ICustomerService {
	@Autowired
	CustomerDaoImpl cdao;

	@Transactional
	public List<Customer> getAllCustomers() {
		//calling the method
		return cdao.getAllCustomers();
	}

	@Transactional
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		return cdao.getCustomer(id);
	}
	@Transactional
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		cdao.addCustomer(customer);
	}

	@Transactional
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		cdao.updateCustomer(customer);
	}

	@Transactional
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		cdao.deleteCustomer(id);
	}

}
