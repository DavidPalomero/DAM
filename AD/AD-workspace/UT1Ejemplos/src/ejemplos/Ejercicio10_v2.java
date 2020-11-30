package ejemplos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio10_v2 {

	public static void main(String[] args) throws IOException {
		//Lectura del fichero l�nea a l�nea
		File fichero = new File("ejercicio10.txt");
		FileReader fr = new FileReader(fichero);
		BufferedReader br = new BufferedReader(fr);
		
		//Leemos el fichero y mostramos su contenido por consola
		//Si �nicamente tiene una l�nea:
		//System.out.println(br.readLine());
		
		String cadena;
		
		for(int i = 0; i<fichero.length(); i++) {
			cadena = br.readLine();
			if(cadena != null) {			
				System.out.println(cadena);
			}
		}
		
		/*if(fichero.exists()) {
			cadena = br.readLine();
			while (cadena != null) {
				System.out.println(cadena);
				cadena = br.readLine();
			}
		} else {
			System.err.println("El fichero especificado no existe.");
		}*/	
		
		br.close();

	}

}
