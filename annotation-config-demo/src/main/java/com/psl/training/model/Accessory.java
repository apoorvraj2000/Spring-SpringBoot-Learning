package com.psl.training.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Component
//@Controller
//@Service
@Repository
public class Accessory {
	
@Value("${vehicle.accessory.name}")	
private String name;

public String getName() {
	return name;
}

//public void setName(String name) {
//	this.name = name;
//}

}
