package ejemplos;

import java.io.IOException;
import java.io.StringReader;

public class Ejercicio9_clase {

	public static void main(String[] args) throws IOException {
		String cadena = "En un lugar de la Mancha de cuyo...";
		StringReader sr = new StringReader(cadena);
		char c;
		for(int i=0; i<cadena.length();i++) {
			c = (char) sr.read();
			System.out.println(c);
		}

	}

}
