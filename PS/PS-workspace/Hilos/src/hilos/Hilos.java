package hilos;

public class Hilos extends Thread {

	int n;
	
	public Hilos(int n) {
		this.n = n;
	}
	
	public void run() {
		System.out.println("Creando hilo " + n);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Dentro de hilo " + n + " Nº..." + i);
		}
	}
	
}
