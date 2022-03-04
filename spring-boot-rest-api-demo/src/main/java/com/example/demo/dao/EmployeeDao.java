package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Employee;


public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	
	@Query(value = "select count(*) from employee_tbl",nativeQuery = true)
	public int countOfEmployee();
 public List<Employee>findByCity(String city);
}
