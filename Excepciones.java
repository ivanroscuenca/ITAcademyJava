package ex2;

/*Exercici 2. Defineixi una refer�ncia a un objecte i inicialitzi-la amb null. 
Tracti d'invocar un m�tode a trav�s d'aquesta refer�ncia.
Ara envolti el codi amb una cl�usula try-*catch per a capturar l'excepci�.*/


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


