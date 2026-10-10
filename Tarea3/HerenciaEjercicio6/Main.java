package Tarea3.HerenciaEjercicio6;

public class Main {
    public static void main(String[] args) {
        Acuatico acuatico = new Acuatico(5, 3.0, "Sabalo", 50.0, "Salada");
        Aereo aereo = new Aereo(8, 10.0, "Condor", "Frio", "Alta");
        Terrestre terrestre = new Terrestre(10, 200, "Leon", 80, "Carnivoro");

        Animal[] animales = {acuatico, aereo, terrestre};

        //muestro sus datos de cada tipo de animal
        for (Animal animal : animales) {
            System.out.println(animal);
            System.out.println("");
        }

        //muestro sus metodos de cada animal sobreescribiendo la clase padre
        for (Animal animal : animales) {
            System.out.println(animal.respirar());
            System.out.println(animal.mover());
            System.out.println("");
        }

        //muestro algunos metodos independientes de cada animal
        System.out.println(acuatico.nadar());
        System.out.println(aereo.cazar());
        System.out.println(terrestre.correr());
    }
}