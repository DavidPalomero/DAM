package proccessBuilder_Command;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ProccessBuilder_Command {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProcessBuilder pb = new ProcessBuilder();
		pb = pb.command("CMD", "/C", "DIR");
		//ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "DIR");
		
		try {
			Process p = pb.start();
			InputStream input = p.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(input));
			
			//leemos cada linea del buffer y lo visualizamos
			
			String linea;
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
				br.close();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
