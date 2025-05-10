package com.local.employeeservice.service;

import java.util.List;

import com.local.employeeservice.entity.Employee;
import com.local.employeeservice.exceptions.EmployeeAlreadyExistsException;
import com.local.employeeservice.exceptions.EmployeeNotFoundException;

public interface EmployeeService {
	Employee saveEmployee(Employee emp) throws EmployeeAlreadyExistsException;

	List<Employee> fetchEmployeetList();

	Employee updateEmployee(Employee emp, Long empId);

	void deleteEmployeeById(Long empId);

	Employee getEmployeeById(Long empId) throws EmployeeNotFoundException;
}
