package hilosMetodos;

public class CrearHilos {

	public static void main(String[] args) {
		HilosMetodos hilo = null;
		
		for (int i = 1; i <= 3; i++) {
			hilo = new HilosMetodos();
			hilo.setName("hilo" + i);
			hilo.setPriority(i);
			hilo.start();
			
			System.out.println("Informacion del hilo " + hilo.getName()+ "---" + hilo.toString());
		}
		
		System.out.println("3 hilos creados");
	}

}
