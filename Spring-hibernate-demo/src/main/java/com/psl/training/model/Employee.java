package com.psl.training.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_details")
public class Employee {

	private String empname;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empid;
	private String city;
	private Date joindate;
	
	
	public Employee() {
		
	}
	
	public Employee(String empname, String city, Date joindate) {
		super();
		this.empname = empname;
		this.city = city;
		this.joindate = joindate;
	}

	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Date getJoindate() {
		return joindate;
	}
	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}
	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", empid=" + empid + ", city=" + city + ", joindate=" + joindate + "]";
	}
	
	
	
	
}
