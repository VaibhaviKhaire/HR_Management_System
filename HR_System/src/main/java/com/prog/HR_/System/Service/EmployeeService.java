package com.prog.HR_.System.Service;

import java.util.List;

import com.prog.HR_.System.Model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
}