package actividad01;

public class GenerarVehiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		//Instancia del Vehiculo
		Vehiculo coche = new Vehiculo(5, 70, 5);
		Vehiculo sport = new Vehiculo(2, 50, 15);
	
		// Mostrar por pantalla la autonomia y las plazas
		System.out.println("El coche puede llevar " + coche.getPlazas() + 
				" pasajeros y tiene una autonomia de " + coche.autonomia() +
				"Km con el deposito lleno");
		System.out.println("El coche puede llevar " + sport.getPlazas() + 
				" pasajeros y tiene una autonomia de " + sport.autonomia() +
				"Km con el deposito lleno");
	}
	
	

}
