package com.vehicles.project;

import java.util.List;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) {
		super(plate, brand, color);
	}

	//afegint els mètodes necessaris a Bike, de manera que es pugui afegir rodes davanteres i traseres.  
	
	public void addWheelsbike(List<Wheel> frontWheelsbike, List<Wheel> backWheelsbike) throws Exception {
		addTwoWheelsbike(frontWheelsbike, frontWheelsbike);
		addTwoWheelsbike(backWheelsbike, backWheelsbike);
		
		
	}

	private void addTwoWheelsbike(List<Wheel> frontWheelsbike,List<Wheel> backWheelsbike ) {
		this.wheels.add((Wheel) frontWheelsbike);
		this.wheels.add((Wheel) backWheelsbike);
		
	}

}

