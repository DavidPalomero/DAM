package actividades;

import java.io.File;
import java.util.Date;

public class Actividad04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//David Palomero: Actividad-04 Obtener la �ltima fecha de modificaci�n del fichero �fichero.txt�. 

		File fichero = new File("fichero.txt");
		
		Date ultimafecha = new Date(fichero.lastModified());
		
		System.out.println(ultimafecha);
	}

}
