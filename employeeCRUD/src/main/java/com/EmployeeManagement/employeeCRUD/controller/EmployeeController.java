package com.EmployeeManagement.employeeCRUD.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeManagement.employeeCRUD.model.Employee;
import com.EmployeeManagement.employeeCRUD.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/Employeelist")
	@CrossOrigin(origins="http://localhost:4200")
	public List<Employee> getEmployeeList(){
		List<Employee> employees = new ArrayList<Employee>();
		//logic to fetch list from database
		employees=service.getEmployeeList();
		
	return employees;
	}

	@PostMapping("/Addemployee")
	@CrossOrigin(origins="http://localhost:4200")
	public Employee saveEmployee(@RequestBody Employee employee){
		return service.saveEmployeeToDB(employee);
	}
	
	@GetMapping("/Getemployeebyid/{id}")
	@CrossOrigin(origins="http://localhost:4200")
	public Employee getEmployee(@PathVariable int id){
		Employee employees = new Employee();
		//logic to fetch list from database
		return employees=service.getEmployeeById(id).get();
		
	
	}

	
	@DeleteMapping("/Deleteemployee/{id}")
	@CrossOrigin(origins="http://localhost:4200")
	public String deleteEmployeeById(@PathVariable int id) {
		
		return service.deleteEmployeeById(id);
	}
	
}
