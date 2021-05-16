package com.EmployeeManagement.employeeCRUD.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EmployeeManagement.employeeCRUD.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{



}
