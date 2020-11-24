package ejemplos;

import java.io.File;
import java.io.IOException;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crear un fichero con rutas
		//File fichero = new File("ejemplo1.txt"); //en la carpeta actual
		File fichero = new File("C:\\AD\\ejemplo1.txt"); //con ruta
		
		try {
			if (fichero.createNewFile()) {
				System.out.println("fichero creado correctamente");
			} else {
				System.out.println("el fichero no se ha creado");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
