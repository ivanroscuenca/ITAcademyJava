package ex4;

import java.util.*;

/*Creu la seva pròpia classe de Exception utilitzant la paraula clau 'extends'. 
Escrigui un constructor per a aquesta classe que prengui un argument String i l'emmagatzemi 
dins de l'objecte com una referència de tipus String. Escrigui un mètode que mostri la cadena de 
caràcters emmagatzemada.Creu una clàusula try-*catch per a provar la nova excepció.*/

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
		  // Lanzamos una excepción
		  throw new Exception ("El nombre está fuera de longitud");
		}
}

class longitud_array extends Exception{ // Se crea clase excepcion propia

public longitud_array () {}

public longitud_array (String msj_error) {
super(msj_error);
}
}

}


