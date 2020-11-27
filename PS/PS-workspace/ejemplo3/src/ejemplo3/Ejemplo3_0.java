package ejemplo3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Ejemplo3_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runtime r = Runtime.getRuntime();
		String comando = "java Ejemplo3 'Hola Mundo'";
		
		Process p = null;
		
		if (args.length < 1) {
			System.out.println("Se necesita un saludo");
			System.exit(1);
		}
		
		try {
			
			FileOutputStream fos = new FileOutputStream(args[0]);
			PrintWriter pw = new PrintWriter(fos);
			
			InputStream is = p.getInputStream();
			BufferedReader br = new BufferedReader (new InputStreamReader(is));
			
			String linea;
			while ((linea = br.readLine()) != null) {
				System.out.println("INSERTO EN " + args[0] + " > " + linea);
				pw.println(linea);
			}
			br.close();
			pw.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int exitVal;
		
		try {
			
			exitVal = p.waitFor();
			System.out.println("valor de Salida " + exitVal);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
