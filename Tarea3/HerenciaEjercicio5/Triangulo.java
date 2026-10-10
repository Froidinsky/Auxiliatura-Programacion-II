package Tarea3.HerenciaEjercicio5;

public class Triangulo extends Figura {
    private int lado1;
    private int lado2;
    private int lado3;

    public Triangulo(String color, int lado1, int lado2, int lado3) {
        super(color);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double obtenerArea() {
        if ((lado1 + lado2 <= lado3) || (lado1 + lado3 <= lado2) || (lado2 + lado3 <= lado1)){
            System.out.println("el triangulo no es valido");
            return 0;
        } else {
            double semiperimetro = (double) (lado1 + lado2 + lado3) / 2;
            double s = semiperimetro;
            return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
        }
    }
}