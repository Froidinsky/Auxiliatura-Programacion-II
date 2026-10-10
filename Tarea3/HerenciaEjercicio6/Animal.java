package Tarea3.HerenciaEjercicio6;

public class Animal {
    protected int edad;
    protected double peso;
    protected String especie;

    public Animal(int edad, double peso, String especie) {
        this.edad = edad;
        this.peso = peso;
        this.especie = especie;
    }

    public String respirar() {
        return "Animal respirando...";
    }

    public String mover() {
        return "El animal se esta moviendo ";
    }
}