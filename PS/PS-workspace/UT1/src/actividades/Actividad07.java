package actividades;

import java.io.File;
import java.io.IOException;

public class Actividad07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*David Palomero: 
		Actividad-07 Crear un directorio (de nombre ‘FICHEROS’) en el directorio actual,
		a continuación, crear dos ficheros vacíos en dicho directorio.
		Renombrar uno de ellos. Finalmente, borrar uno de los ficheros creados.
		*/
		
		//declarar
		File directorio = new File("FICHEROS");
		File fichero1 = new File(directorio, "vacio1");
		File fichero2 = new File(directorio, "vacio2");
		
		try {
			//crear directorio y ficheros
			directorio.mkdir();
			fichero1.createNewFile();
			fichero2.createNewFile();
			
			//renombrar y borrar
			fichero1.renameTo(new File(directorio, "vacio3"));
			fichero2.delete();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
