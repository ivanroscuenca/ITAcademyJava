package com.vehicles.project;

public class Wheel {
	private String brand;
	private double diameter;

	
	public Wheel(String brand, double diameter) {
		this.setBrandRoda(brand);
		this.setDiameter(diameter);

	}

	public String getBrand() {
		return brand;
	}

	public void setBrandRoda(String brand) {
		this.brand = brand;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
}
