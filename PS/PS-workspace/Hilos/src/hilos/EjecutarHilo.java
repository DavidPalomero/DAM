package hilos;

public class EjecutarHilo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 3; i++) {
			Hilos h = new Hilos(i);
			h.start();
		}
	}

}
