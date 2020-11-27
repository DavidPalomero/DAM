package hilos_Primero;

public class UsarHilo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hilos_Primero hp = new Hilos_Primero();
		hp.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Fuera del hilo " + i);
		}
		
	}

}
