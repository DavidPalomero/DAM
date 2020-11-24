package actividades;

import java.io.File;
import java.io.IOException;

public class Actividad01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//David Palomero: Actividad-01 Comprobar si existe el fichero ‘fichero.txt’ en el directorio actual. 

		
		File fichero = new File("fichero.txt");
		
		try {
			fichero.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (fichero.exists()) {
			System.out.println("el fichero existe");
		} else {
			System.out.println("el fichero no existe");
		}
		

	}

}
