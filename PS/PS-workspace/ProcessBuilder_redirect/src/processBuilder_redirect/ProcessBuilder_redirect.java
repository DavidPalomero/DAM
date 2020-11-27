package processBuilder_redirect;

import java.io.File;
import java.io.IOException;

public class ProcessBuilder_redirect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "DIRpipo");
		
		File fOut = new File("C:\\Users\\DAW1\\eclipse-workspace\\ProcessBuilder_redirect\\SalidaFicheros\\out.txt");
		File fErr = new File("C:\\Users\\DAW1\\eclipse-workspace\\ProcessBuilder_redirect\\SalidaFicheros\\error.txt");
		
		pb.redirectOutput(fOut);
		pb.redirectError(fErr);
		try {
			pb.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}