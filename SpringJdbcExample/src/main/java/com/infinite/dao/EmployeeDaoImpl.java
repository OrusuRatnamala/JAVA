package com.infinite.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;

import com.infinite.helper.EmployeeRowMapper;
import com.infinite.interfaces.IEmployeeDao;
import com.infinite.pojo.Employee;

/**
 * @author ratnamalao This class is for DAO implementationprints
 *
 */
public class EmployeeDaoImpl implements IEmployeeDao {
	private DataSource dataSource = null;
	private JdbcTemplate jdbcTemplate = null;
	private PlatformTransactionManager transactionManager = null;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}

	public void createTable() {
		// TODO Auto-generated method stub
		String sql = "create table employee (empid int primary key " + "auto_increment,firstname varchar(25),"
				+ "lastname varchar(25),salary numeric(8,2)";
		jdbcTemplate.execute(sql);
		System.out.println("table created");

	}

	public void insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		String sql = "insert into employee(firstname,lastname,salary) " + "values (?,?,?)";
		// var...args
		jdbcTemplate.update(sql, employee.getFirstname(), employee.getLastname(), employee.getSalary());
		System.out.println("employee record inserted");
	}

	public void deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub
		String sql ="delete from employee where empId=? ";
		jdbcTemplate.update(sql,new Object[] {employeeId });
		System.out.println("employee record deleted ");

	}

	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		String sql = "select * from employee";
		List<Employee> employees = jdbcTemplate.query(sql, new EmployeeRowMapper(), new Object[] {});
		System.out.println("All Employees Data");
		return employees;

	}

	public String findEmployeeName(int empId) {
		// TODO Auto-generated method stub
		System.out.println("found the employee name");
		return null;
	}

	public Employee findEmployee(int empId) {
		// TODO Auto-generated method stub
		System.out.println("number of employeeid");
		return null;
	}

	public int countEmployees() {
		// TODO Auto-generated method stub
		System.out.println("number of employee are found");
		return 0;
	}

	public void addbonus(Employee employee, int experience) {
		// TODO Auto-generated method stub
		System.out.println("bonus is added");

	}

}
