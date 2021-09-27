package ex2;

/*Exercici 2. Defineixi una referència a un objecte i inicialitzi-la amb null. 
Tracti d'invocar un mètode a través d'aquesta referència.
Ara envolti el codi amb una clàusula try-*catch per a capturar l'excepció.*/


public class Excepciones {

		int num = 2;
		int square() {
			return num*num;
		}
		public static void main(String[] args) {
			
	//Excepciones exc2 = new Excepciones();
		
			Excepciones exc2 = null;
			
			try {
				exc2.square();
				
			}catch (Exception e) {
				
				System.out.println(e.getMessage());
				
			}
		}
		
}


