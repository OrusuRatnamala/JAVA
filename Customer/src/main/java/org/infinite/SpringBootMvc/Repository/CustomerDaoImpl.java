package org.infinite.SpringBootMvc.Repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.infinite.SpringBootMvc.Model.Customer;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDaoImpl implements ICustomerDao {

	private SessionFactory sfactory;

	public void setSfactory(SessionFactory sfactory) {
		this.sfactory = sfactory;
	}

	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		Session scs = this.sfactory.getCurrentSession();
		List<Customer> ls = scs.createQuery("from customer").list();
		return ls;
	}

	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub

	}

	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub

	}

}
