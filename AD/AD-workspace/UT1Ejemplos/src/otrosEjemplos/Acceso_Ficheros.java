package otrosEjemplos;

/*Programa que imprime un listado de todo lo que haya dentro de una carpeta o directorio*/


import java.io.*;

public class Acceso_Ficheros {

	public static void main(String[] args) {
		
		File ruta=new File("C:/Users/Angel/Dropbox/Mi PC (DESKTOP-VTT6CGG)/Desktop/java_ser");
			//La ruta anterior corresponde con la ubicación de la carpeta sobre la que se trabaja
			//Si se quiere hacer sobre el directorio actual, habrái que modificar esa ruta por "."
		System.out.println(ruta.getAbsolutePath());
		
		String[] nombres_archivos=ruta.list();
		
		for(int i=0;i<nombres_archivos.length;i++) {
			System.out.println(nombres_archivos[i]);
			
		//Este nuevo constructor va a mirar si de los elementos listados
		//alguno es un directorio, y en caso de que lo sea, que me muestre
		//también su contenido
			
		File f=new File(ruta.getAbsolutePath(),nombres_archivos[i]);
		
		if(f.isDirectory()) {
			
			String[] archivos_subcarpeta=f.list();
			
			for(int j=0;j<archivos_subcarpeta.length;j++){
				
				System.out.println(archivos_subcarpeta[j]);
			}
		}
			
		}
	}
}
