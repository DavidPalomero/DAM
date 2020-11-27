package ejemplo2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runtime r = Runtime.getRuntime();
		
		String comando = "CMD /C DIR";
		Process p = null;
		
		try {
			p = r.exec(comando);
			
			InputStream er = p.getErrorStream();
			BufferedReader brer = new BufferedReader(new InputStreamReader(er));
			
			String linea_err;
			while ((linea_err = brer.readLine()) != null) {
				System.out.println("ERROR >" + linea_err);
			};
					
			InputStream s = p.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(s));
			
			String linea;
			
			while ((linea = br.readLine()) != null ) {
				System.out.println(linea);
				br.close();
			}
			
		}catch (Exception e) {
			// TODO: handle exception
		}

	}

}
