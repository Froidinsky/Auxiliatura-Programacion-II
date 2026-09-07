package Tarea1.Ejercicio2;

public class Computadora {
    private String marca;
    private String procesador;
    private int ram;
    private int almacenamiento;

    public Computadora() {
    }

    public Computadora(String marca, String procesador, int ram, int almacenamiento) {
        this.marca = marca;
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void verificarRam(int ram) {
        if (this.ram == ram) {
            System.out.println("La memoria ram " + this.ram + " es igual a " + ram);
        } else {
            System.out.println("La memoria ram " + this.ram + " NO es igual a " + ram);
        }
    }

    public String compararAlmacenamiento(Object obj) {
        Computadora otro = (Computadora) obj;
        if (this.almacenamiento > otro.almacenamiento) {
            return "Marca: " + this.marca + "\nProcesador: " + this.procesador + "\nRam: " + this.ram + "\nAlmacenamiento: " + this.almacenamiento;
        } else if (this.almacenamiento < otro.almacenamiento) {
            return "Marca: " + otro.marca + "\nProcesador: " + otro.procesador + "\nRam: " + otro.ram + "\nAlmacenamiento: " + otro.almacenamiento;
        } else {
            return "Son iguales";
        }
    }
}
