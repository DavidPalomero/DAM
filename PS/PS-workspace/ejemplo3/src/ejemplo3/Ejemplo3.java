package ejemplo3;


public class Ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		if (args.length < 1) {
			System.out.println("Se necesita un saludo");
			System.exit(1);
		} else {
			
			
			for (int i = 0; i < 5; i++) {
				System.out.println(i + ". " + args[0]);
			}
		}
	}
}
