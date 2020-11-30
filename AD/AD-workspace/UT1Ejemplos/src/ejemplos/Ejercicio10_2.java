package ejemplos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ejercicio10_2 {

	public static void main(String[] args) throws IOException {
		File origen = new File("ejercicio10.txt");
		File destino = new File("ejercicio10-copia.txt");
		
		FileReader fr = new FileReader(origen);
		FileWriter fw = new FileWriter(destino);
		
		BufferedReader br = new BufferedReader(fr);
		PrintWriter pw = new PrintWriter(fw);
		
		String cadena;
		
		//Lectura del fichero de origen línea a línea y
		//escritura en el fichero de destino
		while((cadena = br.readLine()) != null) {
			pw.println(cadena);
		}
		
		br.close();
		pw.close();

	}

}
