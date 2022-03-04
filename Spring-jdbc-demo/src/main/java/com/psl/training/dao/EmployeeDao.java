package com.psl.training.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.psl.training.model.Employee;

//Get Connected to DB
@Repository
public class EmployeeDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public Employee getEmployeeById(int id) {
		String qry="select * from employee where empid=?";
		//this method return single object
		return jdbcTemplate.queryForObject(qry,new BeanPropertyRowMapper<Employee>(Employee.class),id);
		
	}
	
	public	List<Employee>getAllEmployee(){
		String qry="select * from employee ";
		//this method return single object
		return jdbcTemplate.query(qry,new BeanPropertyRowMapper<Employee>(Employee.class));
	}
	public	boolean insertEmployee(Employee emp) {
		try {
			String qry="insert into employee value(?,?,?)";
			jdbcTemplate.update(qry,emp.getEmpid(),emp.getEmpname(),emp.getCity());
			return true;
		}catch(Exception e) {
			
		}
		return false;
	}
	public	boolean updateEmployee(Employee emp) {
		return false;
	}
	public	boolean deleteEmployee(int empid) {
		return false;
	}
}
