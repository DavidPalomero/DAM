package actividades;

import java.io.File;

public class Actividad06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//David Palomero: Actividad-06 Crear el directorio ‘UT1’ y en su interior el directorio ‘Ejercicios’
		
		File directorio = new File("UT1\\Ejercicios"); //declarar
		
		directorio.mkdirs(); //crear

	}

}
