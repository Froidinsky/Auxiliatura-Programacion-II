package Tarea1.Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus();

        System.out.println("Asientos disponibles " + bus1.getContarAsientosDisponibles());

        System.out.println("");

        bus1.subirPasajero(1);
        bus1.subirPasajero(2);
        bus1.subirPasajero(3);
        bus1.subirPasajero(4);
        bus1.subirPasajero(5);

        System.out.println("");

        System.out.println("Asientos disponibles: " + bus1.getContarAsientosDisponibles());

        System.out.println("Total pasajes: " + bus1.cobrarPasaje());
    }

}
