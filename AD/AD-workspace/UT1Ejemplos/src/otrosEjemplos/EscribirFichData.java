
package otrosEjemplos;

import java.io.*;

/*El siguiente ejemplo inserta datos en el fichero FichData.dal, los datos los toma de dos
arrays, uno contiene los nombres de una serie de personas y el otro sus edades, recorremos los
arrays y vamos escribiendo en el fichero el nombre (mediante el m�todo writeUTF(String)) y la
edad (mediante el m�todo writeInt(int)):*/

public class EscribirFichData {
	public static void main(String[] args) throws IOException {

		File fichero = new File("FichData.dat");
		FileOutputStream fileout = new FileOutputStream(fichero);
		DataOutputStream dataOS = new DataOutputStream(fileout);

		String nombres[] = { "Ana", "Luis Miguel", "Alicia", "Pedro", "Manuel", "Andr�s", "Julio", "Antonio",
				"Mar�a Jes�s" };

		int edades[] = { 14, 15, 13, 15, 16, 12, 16, 14, 13 };

		for (int i = 0; i < edades.length; i++) {
			dataOS.writeUTF(nombres[i]); // escribe nombre
			dataOS.writeInt(edades[i]); // escribe edad
		}
		dataOS.close(); // cerrar stream
	}
}
