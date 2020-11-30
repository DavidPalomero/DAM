package ejemplos;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * 
 * EJEMPLO 3:
 * Utilizar los caracteres de conversión para dar formato en la salida de datos.
 * 
 */

public class Ejemplo03 {

	private static Scanner entrada;

	public static void main(String[] args) {
		
		//Solicitamos datos
		
		String dato1;
		int dato2;
		Float dato3;
		Double dato4;
		
		entrada = new Scanner(System.in);
		
		System.out.println("Introducir una cadena: ");
		dato1 = entrada.nextLine();
		
		System.out.println("Introducir un número entero: ");
		dato2 = entrada.nextInt();
				
		System.out.println("Introducir un float: ");
		dato3 = entrada.nextFloat();
		
		System.out.println("Introducir un double: ");
		dato4 = entrada.nextDouble();
		
		
		//Mostramos datos en pantalla
		
		System.out.printf("\nCadena introducida: %s",dato1);
		System.out.printf("\nDatos introducidos: %d y %f", dato2, dato3);
		System.out.printf("\nDatos en notación científica %e" , dato4);
		
		
		//Mostramos datos con formato
		
		DecimalFormat formateador = new DecimalFormat("####.#");
		
		System.out.println("\n\nCadena : " + dato1);
		System.out.println("Entero: " + dato2);
		System.out.println("Float: " + dato3);
		System.out.println("Float con formato: " + formateador.format(dato3));
		System.out.println("Double: " + dato4);
		System.out.println("Double con formato: " + formateador.format(dato4));

	}

}
