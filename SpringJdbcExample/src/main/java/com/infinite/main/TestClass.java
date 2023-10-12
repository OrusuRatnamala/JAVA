package com.infinite.main;

import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infinite.dao.EmployeeDaoImpl;
import com.infinite.pojo.Employee;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("JdbcBeans.xml");
		EmployeeDaoImpl daoImpl = (EmployeeDaoImpl) context.getBean("empDaoImpl");
		// daoImpl.createTable();
		daoImpl.deleteEmployee(19);
		/*
		 * Employee employee = new Employee(); employee.setFirstname("Kamal");
		 * employee.setLastname("Emi"); employee.setSalary(2300); Employee
		 * employee2 = new Employee("Emi", "Jack", 34000);
		 * daoImpl.insertEmployee(employee); daoImpl.insertEmployee(employee2);
		 * // daoImpl.createTable(); Iterator <Employee>
		 * it=daoImpl.getAllEmployees().iterator(); while(it.hasNext()) {
		 * System.out.println(it.next().getFirstname());
		 * 
		 * }
		 * 
		 * 
		 * }
		 */
	}
}