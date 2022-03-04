package com.psl.training.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.training.Vehicle;

public class Main {
	public static void main(String[]args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beansConfig.xml");
		
		
		Vehicle vehicle1=(Vehicle) context.getBean("v1");
		System.out.println("name "+vehicle1.getName());
		System.out.println("color "+vehicle1.getColor());
		System.out.println("-------------------");
		Vehicle vehicle2=(Vehicle) context.getBean("v2");
		System.out.println("name "+vehicle2.getName());
		System.out.println("color "+vehicle2.getColor());
	}
}
