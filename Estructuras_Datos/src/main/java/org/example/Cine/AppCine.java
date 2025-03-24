package org.example.Cine;

import java.util.*;

public class AppCine {

    static Random random = new Random();
    static Deque<Persona> cola = new LinkedList<>();
    static int numeroPersonas = random.nextInt(251);

    public static void main(String[] args) {
        System.out.println("--- CINE AL POBLE ---");
        generarCola();
        System.out.println("Hay " + numeroPersonas + " personas a la cola. " + cola );
        System.out.println("La recaudacion ha sido de " + recaudar() + " €");
    }

    public static void generarCola() {

        int edad;

        for (int i = 0; i < numeroPersonas; i++) {

            edad = random.nextInt(97)+3;
            cola.add(new Persona(edad));

        }

    }

    public static double recaudar() {

        double totalRecaudado = 0;

        while (!cola.isEmpty()) {

            if (cola.peek().getEdad() <= 10) {

                totalRecaudado += 1;

            } else if (cola.peek().getEdad() <= 17) {

                totalRecaudado += 2.5;

            } else {

                totalRecaudado += 3.5;

            }

            cola.poll();

        }
        return totalRecaudado;
    }
}
