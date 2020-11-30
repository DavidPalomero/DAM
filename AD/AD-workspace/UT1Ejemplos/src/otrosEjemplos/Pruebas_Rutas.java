package otrosEjemplos;

/* Ejemplo para obtener la ruta absoluto de un fichero o directorio*/

import java.io.*;

public class Pruebas_Rutas {

	public static void main(String[] args) {
		
		//File archivo=new File("ejemplo_archivo");
		
		File archivo=new File("bin");
		
		System.out.println("------------");
		
		System.out.println(archivo.getAbsolutePath());
		
		System.out.println("---------------------");
		
		System.out.println(archivo.exists()); 
		//Si el fichero existe, devuelve True, y si no False
		
		System.out.println("------------");
	
	}
}
