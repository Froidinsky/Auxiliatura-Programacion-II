package Tarea3.HerenciaEjercicio7;

import java.util.ArrayList;

public class RevistaInvestigacion extends Revista {
    private String campoInvestigacion;

    public RevistaInvestigacion(String titulo, ArrayList<String> autores, String editorial, int anhoPublicacion, int volumen, int numero, String mes, String campoInvestigacion) {
        super(titulo, autores, editorial, anhoPublicacion, volumen, numero, mes);
        this.campoInvestigacion = campoInvestigacion;
    }
}