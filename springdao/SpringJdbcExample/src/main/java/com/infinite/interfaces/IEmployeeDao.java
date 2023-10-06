package com.infinite.interfaces;
import com.infinite.pojo.Employee;
import java.util.List;
public interface IEmployeeDao {
	public void createTable();
		public void insertEmployee(Employee employee);
		public void deleteEmployee(int employeeId);
		public List<Employee> getAllEmployees();
		public String findEmployeeName(int empId);
		public Employee findEmployee(int empId);
		public int countEmployees();
	//	public String callProcedure(int empid);
		public void addbonus(Employee employee,int experience);
}
