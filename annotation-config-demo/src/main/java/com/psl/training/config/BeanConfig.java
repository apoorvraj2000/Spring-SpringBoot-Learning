package com.psl.training.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.psl.training.Vehicle;
import com.psl.training.model.Accessory;
import com.psl.training.model.Engine;

@Configuration
@ComponentScan(basePackages = "com.psl.training")
@PropertySource(value = "classpath:/application.properties")
public class BeanConfig {
	
	@Value("${vehicle.name}")
	String name;
	
	@Value("${vehicle.wheels.count}")
	int noOfWheels;
	
	@Value("${vehicle.color}")
	String color;
	
	@Value("${vehicle.engine.capacity}")
	String engineCapacity;
	
	@Value("${vehicle.elecEngin.capacity}")
	String eleEngineCapacity; 
	
	@Bean
	@Scope("prototype")
	public Vehicle getVehicle() {
		Vehicle vehicle=new Vehicle(name, color);
		vehicle.setNoOfWheels(noOfWheels);
		return vehicle;
	}
	@Bean(name="engine")
	public Engine getEngine(){
		Engine engine=new Engine();
		engine.setCapacity(engineCapacity);
		return engine;
	}
	@Bean(name="electricEngine")
	public Engine getElectricEngine(){
		Engine engine=new Engine();
		engine.setCapacity(eleEngineCapacity);
		return engine;
	}
//	@Bean
//	public Accessory getAccessories() {
//		return new Accessory();
//	}
}
