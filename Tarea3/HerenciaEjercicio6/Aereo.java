package Tarea3.HerenciaEjercicio6;

public class Aereo extends Animal {
    private String habitat;
    private String tipoVision;

    public Aereo(int edad, double peso, String especie, String habitat, String tipoVision) {
        super(edad, peso, especie);
        this.habitat = habitat;
        this.tipoVision = tipoVision;
    }

    public String volar() {
        return "El animal de especie " + especie + " esta volando en su habitat " +  habitat;
    }

    public String cazar() {
        return "El animal de especie " + especie + " esta cazando con su vision " + tipoVision;
    }

    @Override
    public String respirar() {
        return "El animal de especie " + especie + " esta respirando con sus sacos aereos";
    }

    @Override
    public String mover() {
        return super.mover() + "con sus alas";
    }

    @Override
    public String toString() {
        return "Animal tipo aereo: " +
                "\nEdad: " + edad +
                "\nPeso: " + peso + " kg" +
                "\nEspecie: " + especie +
                "\nHabitat: " + habitat +
                "\nTipo de vision: " + tipoVision;
    }
}