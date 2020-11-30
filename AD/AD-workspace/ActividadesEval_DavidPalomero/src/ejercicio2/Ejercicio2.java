package ejercicio2;

import java.io.File;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File fichero = new File(".");
		
		for (String item : fichero.list()) {
			
			System.out.println(item);
		}
	}
	
}
