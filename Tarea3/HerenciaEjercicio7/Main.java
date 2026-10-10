package Tarea3.HerenciaEjercicio7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca1 = new Biblioteca("Central");
        Biblioteca biblioteca2 = new Biblioteca("Facultad");

        ArrayList<String> autores = new ArrayList<>();
        autores.add("Autor de prueba");

        biblioteca1.agregarDocumento(new Libro("Libro 1", autores, "Editorial A", 2000));
        biblioteca1.agregarDocumento(new Revista("Revista 1", autores, "Editorial B", 2020, 3, 12, "marzo"));

        biblioteca2.agregarDocumento(new Libro("Libro 2", autores, "Editorial C", 2010));
        biblioteca2.agregarDocumento(new DocumentoCD("CD 1", autores, "Editorial D", 2015, "CD-ROM", "Libre"));
        biblioteca2.agregarDocumento(new RevistaInvestigacion("Revista Inv 1", autores, "Editorial E", 2022, 5, 2, "mayo", "Fisica"));

        //comparo
        biblioteca1.compararBiblioteca(biblioteca2);

        biblioteca2.trasladarRevistasA(biblioteca1);
        biblioteca1.trasladarLibrosA(biblioteca2);

        //despues de transladar
        mostrar(biblioteca1);
        mostrar(biblioteca2);
    }

    private static void mostrar(Biblioteca b) {
        System.out.println(b.getNombre() + ": " + b.contarDocumentos() + " documentos, "
                + b.contarRevistas() + " revistas, " + b.contarLibros() + " libros");
    }
}