package org.example.Equals_Hashcode;

import java.util.LinkedHashSet;

public class AppImpresora {

    static final String id_pc = "PC4312";
    static LinkedHashSet<Peticion> colaImpresion = new LinkedHashSet<>();

    public static void main(String[] args) {

        System.out.println("--- BIENVENIDO A TU IMPRESORA ONLINE ---");
        anadirDocumento("hola.txt");
        anadirDocumento("doc.pdf");
        anadirDocumento("doc2.pdf");
        anadirDocumento("doc2.pdf");
        imprimirTodo();


    }

    public static void anadirDocumento(String peticion) {

        if (peticion.endsWith(".pdf")) {
            if (colaImpresion.add(new Peticion(id_pc, peticion))) {
                System.out.println("Archivo " + peticion + " añadido a la cola de impresion. " + colaImpresion);
            }
        } else {
            System.out.println("El archivo " + peticion + " no es un .pdf. No se puede añadir a la cola");
        }

    }

    public static void imprimirDocumento() {
        System.out.println("Imprimiendo... " + colaImpresion.getFirst().getNombre());
        colaImpresion.removeFirst();
    }

    public static void verTodo() {
        System.out.println("Cola de impresion: " + colaImpresion);
    }

    public static void imprimirTodo() {
        while (!colaImpresion.isEmpty()) {
            imprimirDocumento();
        }

        System.out.println("La cola esta vacia");
    }
}
