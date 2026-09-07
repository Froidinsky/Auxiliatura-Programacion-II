package Tarea1.Ejercicio4;

public class Bus {
    private int[] pasajeros;
    private final double PASAJE = 1.50;
    private int indice;
    private int contarAsientosDisponibles;

    public Bus() {
        this.pasajeros = new int[20];
        this.indice = 0;
    }

    public int[] getPasajeros() {
        return pasajeros;
    }

    public int getContarAsientosDisponibles() {
        return this.pasajeros.length - indice;
    }

    public void subirPasajero(int pasajero) {
        if (indice < this.pasajeros.length) {
            this.pasajeros[indice] = pasajero;
            indice++;
            System.out.println("Pasajero " + pasajero + " ha subido al bus");
        } else {
            System.out.println("El bus esta lleno");
        }
    }

    public double cobrarPasaje() {
        return indice * PASAJE;
    }

}
