package hilosMetodos;

public class HilosMetodos extends Thread {
	
	public void run() {
		System.out.println("Ejecucion del hilo: " + this.getName() + 
				", Prioridad: " + this.getPriority() + 
				", Identificador: " + this.getId());
	}

}
