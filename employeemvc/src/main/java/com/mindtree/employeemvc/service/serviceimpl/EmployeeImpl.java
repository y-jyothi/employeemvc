package com.mindtree.employeemvc.service.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.employeemvc.entity.Employee;
import com.mindtree.employeemvc.repository.EmployeeRepository;
import com.mindtree.employeemvc.service.EmployeeService;

@Service
public class EmployeeImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;

	@Override
	public Employee addEmployee(Employee emp) {
		repo.save(emp);
		return emp;
	}

	@Override
	public List<Employee> getAllEmployees() {
	
		List<Employee> list=new ArrayList<Employee>();
		list=repo.findAll();
		System.out.println(list);
		
		return list;
	}

}
