package Tarea1.Ejercicio1;

public class Auto {
    private String marca;
    private String modelo;
    private int anio;
    private int kilometraje;
    // aqui le agrego el atributo color para que el auto se cree en el constructor con un color inicial
    private String color;

    public Auto(String marca, String modelo, int anio, int kilometraje, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = kilometraje;
        this.color = color;
    }

    public void mostrarKilometraje() {
        System.out.println("Kilometraje en kilometros: " + this.kilometraje);
        System.out.println("Kilometraje en metros: " + this.kilometraje * 1000);
    }

    public String cambiarColor(String color) {
        this.color = color;
        return "El auto cambio a color " + this.color;
    }

    public String getColor() {
        return color;
    }
}
