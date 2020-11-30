package ejemplos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

/*
 * 
 * EJEMPLO 4:
 * Contar de un fichero el número de palabras y números que contiene.
 * 
 */

public class Ejemplo04 {

	public static void main(String[] args) throws IOException {

		StreamTokenizer st = new StreamTokenizer(new FileReader("acceso_datos\\ejemplo4.txt"));
		int palabras = 0;
		int num = 0;

		try {

			while (st.nextToken() != StreamTokenizer.TT_EOF) {
				if (st.ttype == StreamTokenizer.TT_WORD)
					palabras++;
				else if (st.ttype == StreamTokenizer.TT_NUMBER)
					num++;
			}

			System.out.println("Número de palabras: " + palabras);
			System.out.println("Número de números: " + num);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

}
