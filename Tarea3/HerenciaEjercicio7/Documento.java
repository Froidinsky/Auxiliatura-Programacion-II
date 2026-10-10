package Tarea3.HerenciaEjercicio7;

import java.util.ArrayList;

public class Documento {
    private String titulo;
    private ArrayList<String> autores;
    private String editorial;
    private int anhoPublicacion;

    public Documento(String titulo, ArrayList<String> autores, String editorial, int anhoPublicacion) {
        this.titulo = titulo;
        this.autores = autores;
        this.editorial = editorial;
        this.anhoPublicacion = anhoPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public ArrayList<String> getAutores() {
        return autores;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getAnhoPublicacion() {
        return anhoPublicacion;
    }
}