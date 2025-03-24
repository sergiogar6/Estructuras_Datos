package org.example.Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicios {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ejercicio2();
    }

    public static void ejercicio1() {
        System.out.println("Introduce una frase");
        String[] palabras = sc.nextLine().split(" ");

        LinkedHashMap<String, Integer> mapa = new LinkedHashMap<>();

        for (String palabra : palabras) {
            mapa.put(palabra, mapa.getOrDefault(palabra, 0)+1);
        }

        for (Map.Entry<String, Integer> palabra : mapa.entrySet()) {
            System.out.println(palabra.getKey() + ": " + palabra.getValue());
        }
    }

    public static void ejercicio2() {
        System.out.println("Introduce una palabra");
        String palabra = sc.next();

        LinkedHashMap<Character, Integer> mapa = new LinkedHashMap<>();

        for (Character letra : palabra.toCharArray()) {
            mapa.put(letra, mapa.getOrDefault(letra, 0)+1);

//            SI NO HAY getOrDefault se usa esto:
//            if (mapa.containsKey(letra)) {
//                  mapa.put(letra, mapa.get(letra)+1);
//            } else {
//                  mapa.put(letra, 1);
//            }

        }

        for (Map.Entry<Character, Integer> letra : mapa.entrySet()) {
            System.out.println(letra.getKey() + ": " + letra.getValue());
        }
    }
}
