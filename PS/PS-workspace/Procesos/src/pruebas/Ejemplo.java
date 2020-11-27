package pruebas;

public class Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runtime r = Runtime.getRuntime();
        String comando = "cmd /c dir";
        Process p;
       
        try {
            p = r.exec(comando);
        }catch(Exception e) {
            System.out.println("Error en: "+ comando);
            e.printStackTrace();
        }
	}

}
