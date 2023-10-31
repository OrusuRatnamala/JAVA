package com.infinite.H2DataBaseExample.Controller;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RestController;

	import com.infinite.H2DataBaseExample.Model.Employee;
	import com.infinite.H2DataBaseExample.Service.EmployeeService;

	@RestController
	@RequestMapping("/api")
	public class EmployeeController {
		@Autowired
		EmployeeService EmployeeService;

		@RequestMapping(value = "/employees", method = RequestMethod.POST)
		public Employee createEmployee(@RequestBody Employee emp) {
			System.out.println("creation of table employee");
			return EmployeeService.createEmployee(emp);
		}

		@RequestMapping(value = "/reademployees", method = RequestMethod.GET)
		public List<Employee> readEmployees() {
			return EmployeeService.getEmployees();
		}
	}
