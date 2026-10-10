package Tarea3.HerenciaEjercicio6;

public class Acuatico extends Animal {
    private double tamanho;
    private String tipoAgua;

    public Acuatico(int edad, double peso, String especie, double tamanho, String tipoAgua) {
        super(edad, peso, especie);
        this.tamanho = tamanho;
        this.tipoAgua = tipoAgua;
    }

    public String nadar() {
        return "El animal de especie " + especie + " esta nadando en el agua " + tipoAgua;
    }

    public String escapar() {
        return "El animal de especie " + especie + " y tamanho " + tamanho + " cm esta escapando";
    }

    @Override
    public String mover() {
        return super.mover() + "con sus aletas";
    }

    @Override
    public String respirar() {
        return "El animal de especie " + especie + " esta respirando con sus branquias";
    }

    @Override
    public String toString() {
        return "Animal tipo acuatico: " +
                "\nEdad: " + edad +
                "\nPeso: " + peso + " kg" +
                "\nEspecie: " + especie +
                "\nTamanho: " + tamanho + " cm" +
                "\nVive en tipo de agua: " + tipoAgua;
    }
}