package com.psl.training.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.psl.training.Vehicle;
import com.psl.training.config.BeanConfig;

public class BeanScopeDemo {
	public static void main(String[]args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);
		Vehicle v1=context.getBean(Vehicle.class);
		Vehicle v2=context.getBean(Vehicle.class);
		
		v1.setColor("RED");
		System.out.println(v1.getName());
		System.out.println("V1 Vehicle color="+v1.getColor());
		System.out.println("V1 Vehicle color="+v2.getColor());
		System.out.println(v1.getAccesries().getName());
		System.out.println(v1);
		System.out.println(v2);
	}
}
