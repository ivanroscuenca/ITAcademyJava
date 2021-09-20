package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleApp {
	


		public static void main(String[] args) {
			// Nivell 1 Fase 3
			
			/*Modifica el projecte anterior afegint els mètodes necessaris a Bike, de manera que es pugui afegir rodes davanteres i traseres.  

			
			Preguntar a l’usuari si vol crear un cotxe o una moto.  
			Demanar a l’usuari la matrícula, la marca i el seu color.
			Crear el vehícle amb les dades anteriors. 
			Afegir-li les rodes traseres corresponents, demanant a l’usuari la marca i el diametre
			Afegir-li les rodes davanteres corresponents, demanant a l’usuari la marca i el diametre. */
			
			
			
			// Modificar el Main anterior, afegint la opció de Bike o Car: 
			
			System.out.println(" Introduiu la opció 1 : Cotxe o la opció 2 : bicicleta");
			
			
			
			
			// Demanar a l'usuari la matrícula del cotxe, la marca i el seu color. 
			
			try (Scanner entrada = new Scanner(System.in)) {
				System.out.println(" Introduiu la matricula del vehicle :");
				String plate=entrada.nextLine();
				
				System.out.println(" Introduiu la marca del vehicle :");
				String brand=entrada.nextLine();
				
				System.out.println(" Introduiu el color del vehicle :");
				String color=entrada.nextLine();
				
				//Crear el cotxe amb les dades anteriors.  
				
				System.out.println("-------------------------------------------------------------------------------------");
				
				Car mycar =  new Car(plate, brand, color);

				
				System.out.println(" El meu cotxe es matrícula  : " + mycar.plate.toUpperCase() + " de la marca : "
						+ mycar.brand +" i de color: " + mycar.color); 
				
				System.out.println("-------------------------------------------------------------------------------------");
				
				System.out.println();
				
				// Afegir-li dues rodes traseres demanant a l'usuari la marca i el diametre. 
				
				System.out.println(" Introduiu la marca de la rodes traseres: ");
				String brandRodaTrasera= entrada.nextLine();
				
				System.out.println(" Introduiu el diametre de les rodes traseres :");
				double diameterRodaTrasera= entrada.nextDouble();
				entrada.nextLine();
				
				Wheel wheelback = new Wheel(brandRodaTrasera, diameterRodaTrasera);
				
				
				System.out.println(" El meu cotxe té rodes traseres marca : " + wheelback.getBrand());
						
				System.out.println(" El meu cotxe té rodes traseres diametre : " + wheelback.getDiameter());
				
				// Afegir-li dues rodes davanteres demanant a l'usuari la marca i el diametre. 
				System.out.println("-------------------------------------------------------------------------------------");
				
				System.out.println(" Introduiu la marca de la rodes davanteres: ");
				String brandRodaDavantera= entrada.nextLine();
				
				
				System.out.println(" Introduiu el diametre de les rodes davanteres :");
				double diameterRodaDavantera= entrada.nextDouble();
				entrada.nextLine();
				
				Wheel wheelfront= new Wheel(brandRodaDavantera,diameterRodaDavantera);

				System.out.println(" El meu cotxe té rodes davanteres marca : " + wheelfront.getBrand());
				
				System.out.println(" El meu cotxe té rodes davanteres diametre : " + wheelfront.getDiameter());
				

				//Afegir les rodes:
						List<Wheel> ruedasDelanteras = new ArrayList<>();
						ruedasDelanteras.add(wheelfront);
						ruedasDelanteras.add(wheelfront);
						
						List<Wheel> ruedasTraseras = new ArrayList<>();
						ruedasTraseras.add(wheelback);
						ruedasTraseras.add(wheelback);
						
				// validar matricula
						
				System.out.println("-------------------------------------------------------------------------------------");
				
				System.out.println("El meu cotxe te matricula correcta : " + mycar.validatePlate(plate));
				
				System.out.println("Si la resposta es : true , la matricula es correcta");
				
				System.out.println("Si la resposta es : false , la matricula es incorrecta");
				
				System.out.println("-------------------------------------------------------------------------------------");
				// validar diametre de roda
				
				System.out.println("El meu cotxe te diametre de roda trasera : " + mycar.validateDiameter(diameterRodaTrasera));
				
				System.out.println("El meu cotxe te diametre de roda davantera : " + mycar.validateDiameter(diameterRodaDavantera));
			
				System.out.println("Si la resposta es : true , el diametre es correcte");
				
				System.out.println("Si la resposta es : false , el diametre es incorrecte");
				
				System.out.println("-------------------------------------------------------------------------------------");
				
			}
			
		
	}

}
