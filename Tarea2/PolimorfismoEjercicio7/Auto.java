package Tarea2.PolimorfismoEjercicio7;

public class Auto {
    private String color;
    private double gasolina;

    public Auto() {

    }

    public Auto(String color) {
        this();
        this.color = color;
    }

    public Auto(String color, double gasolina) {
        this(color);
        this.gasolina = gasolina;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getGasolina() {
        return gasolina;
    }

    public void setGasolina(double gasolina) {
        this.gasolina = gasolina;
    }

    public Auto incrementarGasolina() {
        this.gasolina += 5.0;
        return this;
    }

    public Auto sumar(String nuevoColor) {
        this.color = nuevoColor;
        return this;
    }

    public double restar(Auto otroAuto) {
        return this.gasolina + otroAuto.getGasolina();
    }
}
