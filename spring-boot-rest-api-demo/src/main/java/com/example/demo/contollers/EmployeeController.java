package com.example.demo.contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Employee;
import com.example.demo.services.EmployeeService;


@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
	EmployeeService service;
	
	@GetMapping("/{id}")
	public Employee getEmpById(@PathVariable("id")int id) {
		
		return service.getEmployeeById(id);
	}
	
	@GetMapping("/count")
	public int getEmpCount() {
		
		return service.getEmpCount();
	}
	
	
	@GetMapping
	public List<Employee>getAllEmployee(@RequestParam(name="city",required = false)String city){
		if(city!=null) {
			return service.getAllEmployeeByCity(city);
		}
		return service.getAllEmployee();
	}
	
	@PostMapping
	public Employee createEmployee(@RequestBody Employee emp) {
		return service.insertEmployee(emp);
	}
	
}
