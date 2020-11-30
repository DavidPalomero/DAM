package ejercicio3;

import java.io.File;

public class Ejercicio3 {

	public static void main(String[] args) {

		File fichero = new File("src\\Ejercicio3.txt");
		
		String datos = "";
		
		datos = "Nombre: " + fichero.getName() + "\n";
		datos += "Ruta: " + fichero.getPath() + "\n";
		datos += "Ruta absoluta: " + fichero.getAbsolutePath() + "\n";
		datos += "Padre: " + fichero.getParent() + "\n";
		datos += "¿El fichero se puede escribir?: " + ((fichero.canWrite()) ? "Si se puede escribir" : "No se puede escribir") + "\n";
		datos += "¿El fichero se puede leer?: " + (fichero.canRead() ? "Si se puede leer" : "No se puede leer") + "\n";
		datos += "Tamaño del fichero: " + fichero.length() + "\n";
		datos += "¿El fichero es un directorio?: " + (fichero.isDirectory() ? "Es un directorio" : "No es un directorio") + "\n";
		datos += "¿El fichero es un fichero?: " + (fichero.isDirectory() ? "Es un fichero" : "No es un fichero") + "\n";
		
		System.out.println(datos);		
	}

}
