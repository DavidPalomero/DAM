package ejemplos;

/*
 * 
* EJEMPLO 1
* Ejemplo de uso de la clase File donde se muestran diversas formas de declarar un fichero.
* 
*/

import java.io.File;
import java.io.IOException;

public class Ejemplo01 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
				
		File fichero1 = new File("acceso_datos\\fichero1.txt");
		
		try {
			
			// A partir del objeto File creamos el fichero físicamente
			
			if(fichero1.createNewFile())
				System.out.println("El fichero se ha creado correctamente.");
			else
				System.err.println("No se ha creado el fichero.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		String directorio ="acceso_datos";
		File fichero2 = new File (directorio, "fichero2.txt");
		
		File direc = new File (directorio);
		File fichero3 = new File (direc, "fichero3.txt");

	}

}