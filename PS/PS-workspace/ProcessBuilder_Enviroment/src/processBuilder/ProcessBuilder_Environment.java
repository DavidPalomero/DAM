package processBuilder;

import java.util.List;
import java.util.Map;

public class ProcessBuilder_Environment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProcessBuilder pb = new ProcessBuilder();

		// Metodo enviroment del proceso devuelve la variables de entorno

		Map entorno = pb.environment();
		System.out.println("Variables de entorno:");
		System.out.println(entorno);
		
		//El metodo commant nos devuelve el nombre del proceso y sus elementos

		pb = new ProcessBuilder("java", "UnSaludo", "\"Hola mundo!!\"");
		List<String> lista = pb.command();
		for (String cadena : lista) {
			System.out.println(cadena);
		}
	}

}
