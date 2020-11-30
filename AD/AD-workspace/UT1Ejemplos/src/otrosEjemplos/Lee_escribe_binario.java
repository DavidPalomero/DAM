package otrosEjemplos;
import java.io.*;

	//El siguiente ejemplo escribe bytes en un fichero y después los visualiza:

public class Lee_escribe_binario {
	
	public static void main(String[] args) throws IOException {

		File fichero = new  File("src\\otrosEjemplos\\FichBytes.dat" ); // declara
		
		//crea flujo de salida hacia eI fichero
		FileOutputStream fileout = new FileOutputStream(fichero, true);// Añade al final

		//crea flujo de entrada
		FileInputStream filein = new FileInputStream(fichero);

		int i;
		
		for (i=1; i<100; i++)
			fileout.write(i); //escrlbe datos en eI flujo de salida

		fileout.close(); //cerrar stream de salida

		//visualizar 1os datos del fichero
		while ((i = filein.read()) != -1) //lee datos de1 flujo de entrada
			System.out.println(i);
		
		filein.close(); // cerrar stream de entrada
}
}