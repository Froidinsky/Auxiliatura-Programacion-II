package Tarea3.HerenciaEjercicio6;

public class Terrestre extends Animal {
    private int velocidad;
    private String dieta;

    public Terrestre(int edad, double peso, String especie, int velocidad, String dieta) {
        super(edad, peso, especie);
        this.velocidad = velocidad;
        this.dieta = dieta;
    }

    public String correr() {
        return "El animal de especie " + especie + " esta corriendo a una velocidad de " + velocidad + " km/h";
    }

    public String comer() {
        return "El animal de especie " + especie + " con dieta " + dieta + " y peso " + peso + " kg esta comiendo";
    }

    @Override
    public String respirar() {
        return "El animal de especie " + especie + " esta respirando con sus pulmones";
    }

    @Override
    public String mover() {
        return super.mover() + "con sus patas";
    }

    @Override
    public String toString() {
        return "Animal tipo terrestre: " +
                "\nEdad: " + edad +
                "\nPeso: " + peso + " kg" +
                "\nEspecie: " + especie +
                "\nVelocidad: " + velocidad + " km/h" +
                "\nDieta: " + dieta;
    }
}