package com.psl.training;

import org.springframework.beans.factory.annotation.Autowired;

import com.psl.training.model.Accessory;
import com.psl.training.model.Engine;

public class Vehicle {
public String name;
public String color;
public int noOfWheels;

public int getNoOfWheels() {
	return noOfWheels;
}

public void setNoOfWheels(int noOfWheels) {
	this.noOfWheels = noOfWheels;
}

@Autowired(required = false)
public Engine engine;

@Autowired(required = false)
public Engine electricEngine;

@Autowired
Accessory accesries;

public Accessory getAccesries() {
	return accesries;
}

public void setAccesries(Accessory accesries) {
	this.accesries = accesries;
}

public Vehicle(String name, String color) {
	this.name=name;
	this.color=color;
}

public Engine getElectricEngine() {
	return electricEngine;
}

public void setElectricEngine(Engine electricEngine) {
	this.electricEngine = electricEngine;
}

public Engine getEngine() {
	return engine;
}

public void setEngine(Engine engine) {
	this.engine = engine;
}

public void setName(String name) {
	this.name = name;
}

public String getName() {
	return name;
}

public void setColor(String color) {
	this.color = color;
}

public String getColor() {
	return color;
}
}
