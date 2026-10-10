package Tarea3.HerenciaEjercicio5;

public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado1 = new Cuadrado("Rojo", 4);
        Cuadrado cuadrado2 = new Cuadrado("Amarillo", 6);
        Triangulo triangulo1 = new Triangulo("Verde", 3, 4, 5);
        Triangulo triangulo2 = new Triangulo("Naranja", 2, 4, 5);
        Redondo redondo1 = new Redondo("Azul", 5);
        Redondo redondo2 = new Redondo("Negro", 7);

        //comparo los objetos redondo1 y cuadrado1
        if (redondo1.obtenerArea() > cuadrado1.obtenerArea()) {
            System.out.println("Color: " + redondo1.color);
        } else if (cuadrado1.obtenerArea() > redondo1.obtenerArea()) {
            System.out.println("Color: " + cuadrado1.color);
        } else {
            System.out.println("Sus areas son iguales");
        }

        System.out.println("");
        System.out.println("Area de cuadrado1: " + cuadrado1.obtenerArea());
        System.out.println("Area de cuadrado2: " + cuadrado2.obtenerArea());
        System.out.println("Area de redondo1: " + redondo1.obtenerArea());
        System.out.println("Area de redondo2: " + redondo2.obtenerArea());
        System.out.println("Area de triangulo1: " + triangulo1.obtenerArea());
        System.out.println("Area de triangulo2: " + triangulo2.obtenerArea());
    }
}