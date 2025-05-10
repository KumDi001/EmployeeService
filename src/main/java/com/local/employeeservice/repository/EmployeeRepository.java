package com.local.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.local.employeeservice.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	//List<Employee> findByEmailAddress(String emailAddress);
	Employee findByEmailAddress(String empname);

}
