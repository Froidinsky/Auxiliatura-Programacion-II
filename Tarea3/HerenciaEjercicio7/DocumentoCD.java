package Tarea3.HerenciaEjercicio7;

import java.util.ArrayList;

public class DocumentoCD extends Documento {
    private String formatoCD;
    private String tipoLicencia;

    public DocumentoCD(String titulo, ArrayList<String> autores, String editorial, int anhoPublicacion, String formatoCD, String tipoLicencia) {
        super(titulo, autores, editorial, anhoPublicacion);
        this.formatoCD = formatoCD;
        this.tipoLicencia = tipoLicencia;
    }
}