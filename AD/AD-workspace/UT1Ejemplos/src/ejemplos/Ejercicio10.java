package ejemplos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio10 {

	public static void main(String[] args) throws IOException {
		File origen = new File("ejercicio10.txt");
		File destino = new File("ejercicio10-copia.txt");
		
		FileReader fr = new FileReader(origen);
		FileWriter fw = new FileWriter(destino);
		
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		
		//Lectura del fichero de origen línea a línea y
		//escritura en el fichero de destino
		String cadena;
		
		for(int i=0; i<origen.length(); i++) {
			cadena = br.readLine();
			if(cadena != null) {
				System.out.println(cadena);
				bw.write(cadena + "\n");
			}
		}
		
		br.close();
		bw.close();
	}

}
