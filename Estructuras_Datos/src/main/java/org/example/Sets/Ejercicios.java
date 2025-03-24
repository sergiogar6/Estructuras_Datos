package org.example.Sets;

import java.util.*;

public class Ejercicios {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        TreeSet<Integer> lista1 = new TreeSet<>(Arrays.asList(1,4,7,4,33,444,21));
        TreeSet<Integer> lista2 = new TreeSet<>(Arrays.asList(3,2,5,4,22,11,22));
        System.out.println(mezclados(lista2, lista1));
    }

    public static void ejercicio1() {
        System.out.print("Escribe una frase: ");
        String[] frase = sc.nextLine().split(" ");

        Set<String> palabras = new LinkedHashSet<>();

        palabras.addAll(Arrays.asList(frase));

        System.out.println("Palabras únicas: " + palabras);
    }

    public static void ejercicio3() {

        Set<String> historial = new LinkedHashSet<>();

        do {

            System.out.print("Escribe una URL visitada (o 'salir' para terminar): ");
            String pagina = sc.nextLine();

            if (!pagina.equals("salir")) {
                break;
            }

            historial.add(pagina);

        } while (true);

        System.out.println();

        System.out.println("Historial de navegación:");
        int count = 0;

        for (String pagina : historial) {
            System.out.println(++count + ". " + pagina);
        }

    }

    public static Set<Integer> mezclados(TreeSet<Integer> tree1, TreeSet<Integer> tree2) {
        Set<Integer> numeros = new TreeSet<>();
        return numeros;
    }
}
