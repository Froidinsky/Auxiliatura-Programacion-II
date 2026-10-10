package Tarea3.HerenciaEjercicio5;

public abstract class Figura {
    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    public abstract double obtenerArea();
}