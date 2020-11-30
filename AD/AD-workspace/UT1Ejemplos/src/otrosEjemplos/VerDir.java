package otrosEjemplos;
import java.io.*;

public class VerDir {

	public static void main(String[] args) {
		String dir ="."; //Me lleva/gestiona al directorio actual 
		File f = new File(dir);
		String[] archivos = f.list();
		System.out.printf("Ficheros en el directorio actual: %d %n", archivos.length);
			// %d - Cuando el número a mostrar es un entero
			// %n - Salto de linea
		
 		for (int i = 0; i< archivos.length; i++) {
			File f2 = new File(f, archivos[i]);
			System.out.printf("Nombre: %5s, es fichero? %b, es directorio?: %b %n", 
					// %s - indica que se va a mostrar una cadena de caracteres.
					archivos[i], f2.isFile(),f2.isDirectory());
		}
	}
}

