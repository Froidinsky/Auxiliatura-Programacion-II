package Tarea3.HerenciaEjercicio7;

import java.util.ArrayList;

public class Revista extends Documento {
    private int volumen;
    private int numero;
    private String mes;

    public Revista(String titulo, ArrayList<String> autores, String editorial, int anhoPublicacion, int volumen, int numero, String mes) {
        super(titulo, autores, editorial, anhoPublicacion);
        this.volumen = volumen;
        this.numero = numero;
        this.mes = mes;
    }
}