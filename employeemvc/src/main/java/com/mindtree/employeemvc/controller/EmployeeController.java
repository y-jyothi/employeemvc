package com.mindtree.employeemvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mindtree.employeemvc.entity.Employee;
import com.mindtree.employeemvc.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService ser;
	

	 @RequestMapping("/")
	   public String index() {
	      return "index";
	   }
		 @RequestMapping(value = "/values", method = RequestMethod.GET)
		public String getdata(Model model) {

			List<Employee> list = ser.getAllEmployees();

	
			
			model.addAttribute("lists", list);

			return "values";

		}

	
	@RequestMapping(value="/hello",method=RequestMethod.POST)
	public String addEmployees(Employee emp,Model model)
	{
//		model.addAttribute("id",emp.getId());
//		  model.addAttribute("name", emp.getName());
//	      model.addAttribute("email", emp.getEmail());
	//	List<Employee> list=ser.getAllEmployees();

		ser.addEmployee(emp);
		
		return "hello";
		
	}

}
