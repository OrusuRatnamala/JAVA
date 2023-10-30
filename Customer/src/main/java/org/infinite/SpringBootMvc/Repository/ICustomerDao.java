package org.infinite.SpringBootMvc.Repository;

import java.util.List;

import org.infinite.SpringBootMvc.Model.Customer;

public interface ICustomerDao {

	public List<Customer> getAllCustomers();

	public Customer getCustomer(int id);

	public Customer addCustomer(Customer customer);

	public void updateCustomer(Customer customer);

	public void deleteCustomer(int id);

}
