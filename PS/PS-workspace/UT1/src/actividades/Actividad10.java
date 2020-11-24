package actividades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Actividad10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//David Palomero: Actividad-10 Realizar un programa Java que permita leer de un fichero de texto y escribir en otro su contenido
		
		//declarar fichero
		File fichero = new File("ejercicio10.txt");
		
		//abrir flujo
		FileReader fr = new FileReader(fichero);
		char c;
		
		//caracter por caracter
		for (int i = 0; i < fichero.length(); i++) {
			c = (char) fr.read();
			//System.out.print(c + "-");			
		}
		
		
		//linea por linea
		BufferedReader br = new BufferedReader(fr);
		String cadena;
		
		cadena = br.readLine();
		System.out.println(cadena);
//		while (cadena != null) {
//			System.out.println(cadena);
//			cadena = br.readLine();//siguente linea
//		}
		
		br.close();
	}

}
