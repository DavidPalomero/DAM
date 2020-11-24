package hilos_Primero;

public class Hilos_Primero extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Dentro del hilo" + i);
		}
	}
	
}
