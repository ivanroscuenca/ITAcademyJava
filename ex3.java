package ex3;

/*Exercici 3. Escrigui codi per a generar i capturar una excepci� ArrayIndexOutOfBoundsException.*/

public class ex3 {
	
	static int[] matriz  = new int [4] ;

	public static void main(String[] args) {
		
		try {
			System.out.println(matriz[4]);
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
		}

}
	