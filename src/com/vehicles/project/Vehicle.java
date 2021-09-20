package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

	protected String plate;
	protected String brand;
	protected String color;
	protected List<Wheel> wheels = new ArrayList<Wheel>();
	protected double diameter;
	

	public Vehicle(String plate, String brand, String color) {
		this.plate = plate;
		this.brand = brand;
		this.color = color;
	}
		
		//Una matrícula ha de tenir 4 números i dues o tres lletres. 
		
		public boolean validatePlate(String plate) { // getter
				
				boolean correctPlate = false;
				int numberCounter=0;
				int letterCounter=0;
				
				for(int i=0;i<plate.length();i++) {
					if(Character.isDigit(plate.charAt(i))) numberCounter ++;
					if(Character.isLetter(plate.charAt(i))) letterCounter++;
				}
				
				if(numberCounter==4 && (letterCounter==2 || letterCounter==3)) 
				correctPlate=true;
				return correctPlate;
				}
		
		// Un diametre de la roda ha de ser superior a 0.4 i inferior a 4
		
		public boolean validateDiameter(double diameter) { // getter
			
			this.diameter=diameter;
			boolean correctDiameter;
			
			if(diameter<0.4 || diameter>4) {
			correctDiameter=false;
			return correctDiameter;
			}else {
				correctDiameter=true;
				return correctDiameter;
			}
		}
		

}
