package ex1;

public class ex1 {
	
	/*Exercici 1. Creu una classe amb un main() que generi un objecte de la classe Exception dins d'un bloc try.
	Proporcioni al constructor de Exception un argument String. Capturi l'excepci� dins d'una cl�usula catch i imprimeixi l'argument String.
	Afegeixi una cl�usula finally i imprimeixi un missatge per a demostrar que va passar per all�.*/

	public static void main(String[] args) {
	
			    try {
			      int[] myNumbers = {1, 2, 3};
			      System.out.println(myNumbers[10]);
			    } catch (Exception e) {
			      System.out.println("Ha habido un error");
			    } finally {
			      System.out.println("The 'try catch' ha finalizado");
			    }
	}

}
