package ejemplos;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class Ejercicio9_v2 {

	public static void main(String[] args) throws IOException {
		String cadena = "En un lugar de la Mancha de cuyo...";
		StringReader sr = new StringReader(cadena);
		//StringWriter sw = new StringWriter();
		
		char[] caracter = new char[cadena.length()];
		int c;
		
		for(int i=0; i<cadena.length();i++){
			c=sr.read();
			//sw.write(c);
			caracter[i] = (char) c;	
		}
		
		for(int j=0; j<caracter.length; j++) {
			System.out.println(caracter[j]);
		}

	}

}
