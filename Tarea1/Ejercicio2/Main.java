package Tarea1.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Computadora computadora1 = new Computadora("Lenovo", "Core i3", 8, 256);
        Computadora computadora2 = new Computadora();
        computadora2.setMarca("HP");
        computadora2.setProcesador("Core i5");
        computadora2.setRam(16);
        computadora2.setAlmacenamiento(512);

        computadora1.verificarRam(16);
        System.out.println("");
        computadora2.verificarRam(16);

        System.out.println("");

        System.out.println("Computadora con mas almacenamiento: ");
        System.out.println(computadora1.compararAlmacenamiento(computadora2));
    }
}
