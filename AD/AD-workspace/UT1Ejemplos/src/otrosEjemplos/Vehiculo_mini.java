package otrosEjemplos;

/* Un programa que usa la clase Vehiculo
 El archivo se llama DemoVehiculo.java
 */
class Vehiculo {
    int pasajeros;  //números de pasajeros
    int capacidad;  //capacidad del combustible en litros
    int lpkm;        //combustible consumido en kilometros por cada litro
}
//Esta clase declara un objeto de tipo Vehiculo
class Vehiculo_mini {
    public static void main(String[] args) {
        Vehiculo minivan = new Vehiculo();
        int rango;
        //asignando valores a los campos de minivan
        minivan.pasajeros = 9;
        minivan.capacidad = 50;
        minivan.lpkm = 18;
        //Calcular el rango asumiendo un tanque lleno
        rango = minivan.capacidad * minivan.lpkm;
        System.out.println("La Minivan puede llevar " + minivan.pasajeros + " pasajeros con un rango de " + rango + " kilometros por deposito lleno");
    }
}
