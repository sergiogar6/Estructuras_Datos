package org.example.ProblemasProgramaMe;

import java.util.HashMap;

public class VaDeModas {
    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        int caso = in.nextInt();
        in.nextLine();

        if (caso == 0)
            return false;
        else {
            programa(caso);
            return true;
        }

    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

    public static void programa(int caso) {
        String[] numeros = in.nextLine().split(" ");

        if (numeros.length == caso) {
            HashMap<String, Integer> mapaNumeros = new HashMap<>();

            Integer max = 0;
            String claveMax = "";

            for (String numero : numeros) {
                if (mapaNumeros.containsKey(numero)) {
                    mapaNumeros.put(numero, mapaNumeros.get(numero)+1);
                } else {
                    mapaNumeros.put(numero, 1);
                }
                if (max < mapaNumeros.get(numero))  {
                    max = mapaNumeros.get(numero);
                    claveMax = numero;
                }
            }

            System.out.println(claveMax);

        }
    }
}
