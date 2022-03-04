package com.psl.training.dao;

import java.util.List;

import javax.management.RuntimeErrorException;
import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.psl.training.model.Employee;

//Get Connected to DB
@Repository
public class EmployeeDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public Employee getEmployeeById(int id) {
		
		//hibernate will use session for performing db operation
		Session session=sessionFactory.openSession();
		return session.get(Employee.class, id);
		
	}
	
	public	List<Employee>getAllEmployee(){
		Session session=sessionFactory.openSession();
		List<Employee> list= session.createQuery("from Employee",Employee.class).list();
		return list;
	}
	public	boolean insertEmployee(Employee emp) {
		try {
			Session session=sessionFactory.openSession();
			session.beginTransaction();//transection started
			session.save(emp);
			session.getTransaction().commit();
			return true;
		}catch(Exception e) {
			throw e;
		}
		
	}
	public	boolean updateEmployee(Employee emp) {
		try {
			Session session=sessionFactory.openSession();
			session.beginTransaction();//transection started
			session.save(emp); //if record not present it will insert else it will update
			session.getTransaction().commit();
			return true;
		}catch(Exception e) {
			throw e;
		}
	}
	public	boolean deleteEmployee(int id) {
		Session session=sessionFactory.openSession();
		Employee e=session.get(Employee.class, id);
		if(e==null)
			throw new RuntimeException("NOT FOUND");
		session.delete(e);
		return true;
	}
}
