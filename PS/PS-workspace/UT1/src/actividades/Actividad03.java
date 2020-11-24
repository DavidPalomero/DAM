package actividades;

import java.io.File;

public class Actividad03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//David Palomero: Actividad-03 Mostrar la lista de ficheros existentes en el directorio actual.
		
		File directorio = new File(".");
		
		String [] nombres = directorio.list();
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i]);
		}
	}

}
