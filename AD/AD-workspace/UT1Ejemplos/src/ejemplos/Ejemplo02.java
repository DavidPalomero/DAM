package ejemplos;

/*
 * 
 * EJEMPLO 2:
 * Dada una variable, ver la diferencia entre err y out en la salida de datos por pantalla.
 * 
 * */

public class Ejemplo02 {

	public static void main(String[] args) {
		
		int var=1234;
		
		System.out.println("El valor de la variable es: " + var + " con 'out'");
		
		System.err.println("\nEl valor de la variable es: " + var + " con 'err'");
	}

}
