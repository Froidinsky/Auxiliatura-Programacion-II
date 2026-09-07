package Tarea1.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Suzuki", "Vitara", 2009, 5, "Blanco");
        auto1.cambiarColor("Rojo");
        System.out.println("El color del auto1 es: " + auto1.getColor());
        auto1.mostrarKilometraje();

        System.out.println("");

        Auto auto2 = new Auto("Renault", "Captur", 2018, 2, "Plomo");
        auto2.cambiarColor("Negro");
        System.out.println("El color del auto2 es: " + auto2.getColor());
        auto2.mostrarKilometraje();
    }
}
