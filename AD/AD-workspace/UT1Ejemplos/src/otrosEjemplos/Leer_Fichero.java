package otrosEjemplos;

import java.io.*;

/*Este ejemplo lee cada uno de los caracteres del fichero indicado
 * y los muestra en pantalla*/

public class Leer_Fichero {

	public static void main(String[] args) throws IOException {
		// declarar fichero
		File fichero = new File("src\\otrosEjemplos\\Leer_Fichero.txt");
		
		// crear el flujo de entrada hacia e1 fichero
		FileReader fic = new FileReader(fichero);
		int i;
		
		while ((i = fic.read()) != -1) // se va leyendo un carácter
			System.out.println((char) i);
		
		fic.close(); // cerrar fichero
	}
}