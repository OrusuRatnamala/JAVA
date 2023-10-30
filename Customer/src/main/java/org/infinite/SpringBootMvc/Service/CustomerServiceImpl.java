package org.infinite.SpringBootMvc.Service;

import java.util.List;

import org.infinite.SpringBootMvc.Model.Customer;
import org.infinite.SpringBootMvc.Repository.CustomerDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerServiceImpl implements ICustomerService {
	@Autowired
	CustomerDaoImpl cdo;

	@Transactional
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return cdo.getAllCustomers();
	}

	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub

	}

	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub

	}

	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub

	}

}
