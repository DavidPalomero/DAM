package actividades;

import java.io.File;
import java.util.Scanner;

public class Actividad08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//David Palomero: Actividad-08 Realizar un programa Java que muestre los ficheros de un directorio.
		//El nombre del directorio se pasará al programa desde la línea de comandos al ejecutarlo
		
		try (Scanner teclado = new Scanner(System.in)) {
			System.out.println("introduce el nombre");
			
			String directorio = teclado.nextLine();
			
			File fichero = new File(directorio);
			String[] listado = fichero.list();
			
			if (listado.length == 0) {
				System.out.println("El directorio esta vacio");
			}  else {
				for (int i = 0; i < listado.length; i++) {
					System.out.println(listado[i]);
				}
			}
		}
		

	}

}
