package com.EmployeeManagement.employeeCRUD.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EmployeeManagement.employeeCRUD.model.Employee;
import com.EmployeeManagement.employeeCRUD.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired	
	private EmployeeRepository repo;
	
		public List<Employee> getEmployeeList(){
			return repo.findAll();
		}
		
		public Employee saveEmployeeToDB(Employee employee) {
			return repo.save(employee);
		}

	

		public Optional<Employee> getEmployeeById(int id) {
			// TODO Auto-generated method stub
			System.out.println("getting employee by id");
			return repo.findById(id);
		}

		public String deleteEmployeeById(int id) {
			String result ;
			try {
				repo.deleteById(id);
				result ="employee successfully deleted";
				
			} catch (Exception e) {
				// TODO: handle exception
				result ="employee not deleted";
			}
			return result;
		}
}

