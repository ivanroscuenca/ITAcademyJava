package ex4;

import java.util.*;

/*Creu la seva pr�pia classe de Exception utilitzant la paraula clau 'extends'. 
Escrigui un constructor per a aquesta classe que prengui un argument String i l'emmagatzemi 
dins de l'objecte com una refer�ncia de tipus String. Escrigui un m�tode que mostri la cadena de 
car�cters emmagatzemada.Creu una cl�usula try-*catch per a provar la nova excepci�.*/

public class ex4 {

	public static void main(String[] args) {
		String nombre = null;
		try {
			Examina(nombre);
		    } catch (Exception longitud_array) {
		      System.out.println("Algo ha ido mal");
		    }

	}
public static void Examina(String nombre) throws Exception {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Introduce tu nombre menor a 15 caracteres : ");
	nombre = entrada.nextLine();
	if ( nombre.length() < 15 ) {
		System.out.println(nombre);
	} else {
		  // Lanzamos una excepci�n
		  throw new Exception ("El nombre est� fuera de longitud");
		}
}

class longitud_array extends Exception{ // Se crea clase excepcion propia

public longitud_array () {}

public longitud_array (String msj_error) {
super(msj_error);
}
}

}


