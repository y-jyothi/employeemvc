package com.mindtree.employeemvc.service;

import java.util.List;

import com.mindtree.employeemvc.entity.Employee;

public interface EmployeeService {
	public Employee addEmployee(Employee emp);
	public List<Employee> getAllEmployees();

}
