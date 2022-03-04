package com.psl.training;

import org.springframework.beans.factory.annotation.Autowired;

import com.psl.training.model.Engine;

public class Vehicle {
public String name;
public String color;

@Autowired
public Engine engine;

@Autowired
public Engine electricEngine;

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
