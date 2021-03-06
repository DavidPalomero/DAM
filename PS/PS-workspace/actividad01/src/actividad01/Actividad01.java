package actividad01;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class Actividad01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Runtime r = Runtime.getRuntime();
		String comando = "tasklist /svc /fi \"imagename eq svchost.exe\"";
		Process p = null;
		
		if (args.length < 1) {
			System.out.println("Se necesita un fichero");
		}
		
		try {
			
			FileOutputStream fos = new FileOutputStream(args[0]);
			PrintWriter pw = new PrintWriter(fos);
			p = r.exec(comando);
			
			InputStream is = p.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			String linea;
			while ((linea = br.readLine()) != null) {
				
				pw.println(linea);
			}
			br.close();
			pw.close();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
			
			
		int exitVal = 0;
		try {
				
			exitVal = p.waitFor();
			
		} catch (Exception e) {
			System.out.println("Valor de Salida: " + exitVal);
			e.printStackTrace();
		}

	}

}
