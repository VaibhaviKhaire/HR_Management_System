package com.system.Human_Resource_Management_System.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.system.Human_Resource_Management_System.Model.Employee;
import com.system.Human_Resource_Management_System.Model.Leaves;

public interface LeavesRepository extends JpaRepository<Leaves, Long> {

}
