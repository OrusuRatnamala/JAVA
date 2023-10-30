package org.infinite.SpringBootMvc.Service;

import java.util.List;

import org.infinite.SpringBootMvc.Model.Customer;

public interface ICustomerService {
	public List<Customer> getAllCustomers();
	public Customer getCustomer(int id);
	public void addCustomer(Customer customer);
	public void updateCustomer(Customer customer);
	public void deleteCustomer(int id);
}
