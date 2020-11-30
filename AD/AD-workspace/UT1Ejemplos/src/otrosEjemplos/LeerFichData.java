package otrosEjemplos;

import java.io.*;

/*El siguiente ejemplo visualiza los datos grabados anteriormente en el fichero, se deben
recuperar en el mismo orden en el que se escribieron, es decir, primero obtenemos el nombre y
luego la edad:*/

public class LeerFichData {

	public static void main(String[] args) throws IOException {
		File fichero = new File("FichData.dat");
		FileInputStream filein = new FileInputStream(fichero);
		DataInputStream dataIS = new DataInputStream(filein);
		String n;
		int e;

		try {
			while (true) {
				n = dataIS.readUTF(); // recupera eI nombre
				e = dataIS.readInt(); // recupera Ia edad
				System.out.println("Nombre: " + n + ", edad: " + e);
			}
		} catch (EOFException eo) {
		}

		dataIS.close(); // cerrar stream
	}
}