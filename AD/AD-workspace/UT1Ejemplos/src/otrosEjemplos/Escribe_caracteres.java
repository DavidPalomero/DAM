package otrosEjemplos;
import java. io.*;

/*Los caracteres se escriben uno a uno y se obtienen de un String que se
convierte en array de caracteres:*/


public class Escribe_caracteres {
	
	public static void main(String[] args) throws IOException {
		
	File fichero = new File("src\\otrosEjemplos\\Escribe_Fichero.txt"); // declarar fichero

	//crear flujo de salida

	FileWriter fic = new FileWriter(fichero);

	String cadena ="Esto es una prueba de escritura en un fichero con FileWriter";

	//convierte la cadena en array de caracteres para extraerlos 1 a 1
	
	char[] cad = cadena.toCharArray();
	for(int i=0; i<cad.length; i++)
		fic.write(cad[i]); //se van escribiendo los caracteres en el fichero.

	fic.append('*'); //se añade un "*" aI final del texto.
	fic.close(); //cerrar fichero
}
}