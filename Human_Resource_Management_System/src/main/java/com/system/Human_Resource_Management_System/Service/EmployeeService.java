package com.system.Human_Resource_Management_System.Service;

import java.util.List;

import com.system.Human_Resource_Management_System.Model.Employee;



public interface EmployeeService {
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
}
