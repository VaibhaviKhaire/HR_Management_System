package com.system.Human_Resource_Management_System.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.system.Human_Resource_Management_System.Model.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}