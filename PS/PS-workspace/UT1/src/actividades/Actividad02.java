package actividades;

import java.io.File;

public class Actividad02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//David Palomero: Actividad-02 Comprobar si existe el fichero ‘fichero.txt’ dando la ruta completa en la que se encuentra.
		
		File fichero = new File("C:\\Users\\DAW1\\eclipse-workspace\\UT1\\src\\actividades\\fichero.txt");
		
		if (fichero.exists()) {
			System.out.println("el fichero existe");
		} else {
			System.out.println("el fichero no existe");
		}

	}

}
