package com.example.demo.services;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.entities.Employee;


@Service
public class EmployeeService {

	@Autowired
	EmployeeDao empRepo;
	
	public Employee getEmployeeById(int id) {
		return empRepo.findById(id).orElse(new Employee("ram","Pune",Date.valueOf(LocalDate.now()),2300));
	}
	
	public List<Employee> getAllEmployeeByCity(String city){
		return empRepo.findByCity(city);
	}
	
	public List<Employee> getAllEmployee(){
		return empRepo.findAll();
	}
	
	public Employee insertEmployee(Employee emp) {
		
		return empRepo.save(emp);
	}
	
	public Employee updateEmployee(Employee emp) {
	
		return empRepo.save(emp);
	}
	
	public String deleteEmployeeById(int id) {
		
		empRepo.deleteById(id);
		return "Employee Deleted";
	}
	
	public int getEmpCount() {
		return empRepo.countOfEmployee();
	}
}
