package com.system.Human_Resource_Management_System.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.Human_Resource_Management_System.Model.Employee;
import com.system.Human_Resource_Management_System.Repository.EmployeeRepository;
import com.system.Human_Resource_Management_System.Service.EmployeeService;




@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) {
		this.employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(long id) {
	    return employeeRepository.findById(id)
	                             .orElseThrow(() -> new RuntimeException("Employee not found for id :: " + id));
	}


	@Override
	public void deleteEmployeeById(long id) {
		this.employeeRepository.deleteById(id);
	}

}
