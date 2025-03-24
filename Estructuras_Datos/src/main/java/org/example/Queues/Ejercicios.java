package org.example.Queues;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicios {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ejercicio3();
    }

    public static void ejercicio1() {
        Queue<Character> queue = new LinkedList<>();

        queue.offer('a');
        queue.offer('x');
        queue.offer('g');
        queue.offer('u');
        queue.offer('r');

        if (queue.isEmpty()) {
            System.out.println("La cola esta vacia");
        }

        System.out.println("Tamaño de la cola: " + queue.size());
        System.out.println("Primero en la cola: " + queue.peek());

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }

    public static void ejercicio2() {

        Queue<String> colaImpresion = new LinkedList<>();

        colaImpresion.offer("Imprimir documento 1");
        colaImpresion.offer("Imprimir documento 2");
        colaImpresion.offer("Imprimir documento 3");
        colaImpresion.offer("Imprimir documento 4");
        colaImpresion.offer("Imprimir documento 5");

        System.out.println("Estado inicial de la cola de impresion: " + colaImpresion);

        while (!colaImpresion.isEmpty()) {

            System.out.println("Procesando: " + colaImpresion.poll());
            System.out.println("Estado de la cola despues de procesar el trabajo: " + colaImpresion);

        }

        System.out.println("No hay más trabajos en la cosa de impresion");

    }

    public static void ejercicio3() {

        Queue<String> playlist = new LinkedList<>();

        playlist.offer("Let it be - The Beatles");
        playlist.offer("Bohemian Rhapsody - Queen");
        playlist.offer("Shape of You - Ed Sheeran");
        playlist.offer("Blinding Lights - The Weeknd");
        playlist.offer("Stay - Justin Bieber");

        System.out.println("Estado inicial de la cola playlist: " + playlist);

        while (!playlist.isEmpty()) {

            System.out.println("Reproduciendo: " + playlist.poll());
            System.out.println("Estado de la cola playlist despues de reproducir una cancion: " + playlist);

        }

        System.out.println("La playlist ha terminado");

    }

    public static void ejercicio4() {
        Deque<String> lista = new LinkedList<>();

        System.out.println("--- LISTA DE LA COMPRA ---");
        System.out.println("1. Añadir producto al final");
        System.out.println("2. Eliminar primer producto");
        System.out.println("3. Eliminar productor por nombre");
        System.out.println("4. Ver primer producto");
        System.out.println("5. Buscar producto");
        System.out.println("6. Mostrar lista actual");
        System.out.println("X. Salir");

        System.out.print("Seleccione una opción: ");
        String opcion = sc.next();

        System.out.println();
        System.out.println("-------------------------");
        System.out.println();

        switch (opcion) {
            case "1":
                System.out.print("Producto a añadir: ");
                lista.offer(sc.next());
                break;
            case "2":
                System.out.println();
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            case "6":
                break;
            case "X":
                break;

        }

    }

}
