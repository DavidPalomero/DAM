package ejemplos;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio10_v1 {

	public static void main(String[] args) throws IOException {
		//Lectura del fichero caracter a caracter
		File fichero = new File("ejercicio10.txt");
		FileReader fr = new FileReader(fichero);
		//FileReader fr = new FileReader("ejercicio10.txt");
		char c;
		for (int i = 0 ; i<fichero.length();i++) {
			c = (char) fr.read();
			System.out.print(c + "-");
		}
		fr.close();
	}

}
