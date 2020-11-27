package actividades;

import java.io.File;

public class Actividad05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//David Palomero: Actividad-05 Mostrar la siguiente información de un fichero de texto: 
		
		File fichero = new File("fichero.txt");
		
		//a. Nombre del fichero. 
		System.out.println(fichero.getName());
		
		//b. Ruta. 
		System.out.println(fichero.getPath());
		
		//c. Ruta absoluta. 
		System.out.println(fichero.getAbsolutePath());
		
		//d. Nombre del directorio padre. 
		System.out.println(fichero.getParent());
		
		//e. ¿Se puede escribir? 
		if (fichero.canWrite()) {
			System.out.println("Se puede escribir");
		} else {
			System.out.println("No se puede escribir");
		}
		
		//f. ¿Se puede leer? 
		if (fichero.canRead()) {
			System.out.println("Se puede leer");
		} else {
			System.out.println("No se puede lee");
		}
		
		//g. Tamaño. 
		System.out.println(fichero.length());
		
		//h. ¿Es un directorio? 
		if (fichero.isDirectory()) {
			System.out.println("es un directorio");
		} else {
			System.out.println("no es un directorio");
		}
		
		//i. ¿Es un fichero? 
		if (fichero.isFile()) {
			System.out.println("es un fichero");
		} else {
			System.out.println("no es un fichero");
		}
	}

}
