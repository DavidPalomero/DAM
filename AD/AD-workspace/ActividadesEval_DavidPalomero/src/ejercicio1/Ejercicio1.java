package ejercicio1;

import java.io.File;

public class Ejercicio1 {

	public static void main(String[] args) {

		File fichero = new File("fichero.txt");
		
		if (fichero.exists()) {
			System.out.println("El ‘fichero.txt’ si existe");
		} else {
			System.out.println("El ‘fichero.txt’ no existe en la carpeta actual");
		}
	}

}
