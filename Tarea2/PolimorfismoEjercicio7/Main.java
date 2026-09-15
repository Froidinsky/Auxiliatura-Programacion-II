package Tarea2.PolimorfismoEjercicio7;

public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Blanco", 6.0);
        Auto auto2 = new Auto("Red", 2.0);

        auto1.incrementarGasolina();
        auto2.incrementarGasolina().incrementarGasolina();

        auto2.sumar("Negro");

        Auto[] autos = {auto1, auto2};
        int incrementoAuto = 1;

        for (Auto auto : autos) {
            System.out.println("Informacion del auto " + incrementoAuto + ": ");
            System.out.println("Color: " + auto.getColor());
            System.out.println("Gasolina: " + auto.getGasolina());
            System.out.println("");
            incrementoAuto++;
        }

        System.out.println("La suma de la gasolina de ambos autos es: " + auto1.restar(auto2));
    }
}
