package ex5;

import java.util.*;

/*Defineixi un comportament de tipus represa utilitzant un bucle 'while' que es 
repeteixi fins que es deixi de generar una excepció.*/
public class ex5 {

	public static void main(String[] args) {
		
		boolean continuar=true;;
		while  (continuar){
			try {
			System.out.println("Ingrese un número entero del 1 al 10");
			Scanner scanner = new Scanner(System.in);
			int num1 = scanner.nextInt(); 
			
			
			if (num1 >0 && num1<11) {
				continuar =false;
				scanner.close();
				System.out.println("El número ingresado es " + num1);
			}else {
				continuar =true;
			}
			
			}catch (Exception e) {
						
			System.out.println(e.getMessage());
					
						}									
	
		}
	}
	
}
	
	
	

