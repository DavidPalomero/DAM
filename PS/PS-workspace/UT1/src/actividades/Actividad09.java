package actividades;

import java.io.IOException;
import java.io.StringReader;

public class Actividad09 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//David Palomero: Actividad-09: A partir de la cadena de texto ‘En un lugar de la Mancha de cuyo…’,
		//realizar un programa Java que muestre dicha cadena carácter a carácter. 
		
		String cadena = "En un lugar de la Mancha de cuyo...";
		char car;
		
		
		for (int i = 0; i < cadena.length(); i++) {
			car = cadena.charAt(i);
			//System.out.println("Cadena escrita: " + caracter);
		}
		
		//Con StrungReader
		
		StringReader sr = new StringReader(cadena);
		
		for (int i = 0; i < cadena.length(); i++) {
			car = (char) sr.read();
			//System.out.println(caracter);
		}
		
		char[] caracteres = new char[cadena.length()];
		int c;
		
		for (int i = 0; i < caracteres.length; i++) {
			c = sr.read();
			caracteres[i] = (char) c;
		}
		
		for(int i = 0; i < caracteres.length; i++) {
			System.out.println(caracteres[i]);
		}
				

	}

}
