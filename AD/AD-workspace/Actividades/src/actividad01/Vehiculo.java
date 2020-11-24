package actividad01;

public class Vehiculo {
	
	//Parametros
	private int plazas = 0;
	private int capacidaDeposito = 0;
	private int consumo = 0;
	
	//Constructor
	public Vehiculo(int plazas, int capacidaDeposito, int consumo) {
		super();
		this.plazas = plazas;
		this.capacidaDeposito = capacidaDeposito;
		this.consumo = consumo;
	}

	//set and get
	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	public int getCapacida() {
		return capacidaDeposito;
	}

	public void setCapacida(int capacidaDeposito) {
		this.capacidaDeposito = capacidaDeposito;
	}

	public int getConsumo() {
		return consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}
	
	//Calcula la distancia que puede recorrer con el deposito lleno
	public int autonomia() {
		int autonomia = 0;
		
		autonomia = this.capacidaDeposito * this.consumo;
		
		return autonomia;
	}
}
