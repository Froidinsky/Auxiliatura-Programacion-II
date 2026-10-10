package Tarea3.HerenciaEjercicio7;

import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private ArrayList<Documento> documentos;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.documentos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarDocumento(Documento documento) {
        this.documentos.add(documento);
    }

    public int contarRevistas() {
        int contador = 0;
        for (Documento documento : this.documentos) {
            if (documento instanceof Revista) {
                contador++;
            }
        }
        return contador;
    }

    public int contarDocumentos() {
        return this.documentos.size();
    }

    public int contarLibros() {
        int contador = 0;
        for (Documento documento : this.documentos) {
            if (documento instanceof Libro) {
                contador++;
            }
        }
        return contador;
    }

    public void compararBiblioteca(Biblioteca otraBiblioteca) {
        if (this.contarRevistas() > otraBiblioteca.contarRevistas()) {
            System.out.println("La biblioteca " + this.getNombre() + " tiene mas revistas");
        } else if (otraBiblioteca.contarRevistas() > this.contarRevistas()) {
            System.out.println("La biblioteca " + otraBiblioteca.getNombre() + " tiene mas revistas");
        }  else {
            System.out.println("Ambas bibliotecas tienen la misma cantidad de revistas");
        }

        if (this.contarDocumentos() > otraBiblioteca.contarDocumentos()) {
            System.out.println("La biblioteca " + this.getNombre() + " tiene mas documentos");
        } else if (otraBiblioteca.contarDocumentos() > this.contarDocumentos()) {
            System.out.println("La biblioteca " + otraBiblioteca.getNombre() + " tiene mas documentos");
        } else {
            System.out.println("Ambas bibliotecas tienen la misma cantidad de documentos");
        }
    }

    public void trasladarRevistasA(Biblioteca destino) {
        ArrayList<Documento> copia = new ArrayList<>(this.documentos);
        for (Documento documento : copia) {
            if (documento instanceof Revista) {
                destino.agregarDocumento(documento);
                this.documentos.remove(documento);
            }
        }
    }

    public void trasladarLibrosA(Biblioteca destino) {
        ArrayList<Documento> copia = new ArrayList<>(this.documentos);
        for (Documento documento : copia) {
            if (documento instanceof Libro) {
                destino.agregarDocumento(documento);
                this.documentos.remove(documento);
            }
        }
    }

    //para el inciso D no me va alcanzar el tiempo
}