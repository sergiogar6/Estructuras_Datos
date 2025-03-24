package org.example.Maps;

import java.util.HashMap;
import java.util.Map;

public class Pruebas {

    public static void main(String[] args) {

        HashMap<String, Integer> mapaNotas = new HashMap<>();

        mapaNotas.put("Adrian", 6);
        mapaNotas.put("Raul", 3);
        mapaNotas.put("Manuel", 7);

        System.out.println("Nota para Adrián: " + mapaNotas.get("Adrian"));
        System.out.println("Nota Manuel: " + mapaNotas.remove("Manuel"));

        System.out.println(mapaNotas);
        System.out.println(mapaNotas.keySet());

        if (mapaNotas.containsKey("Adrian")) {

            System.out.println("Adrian existe");

        }

        if (mapaNotas.containsValue(10)) {

            System.out.println("Alguien tiene un 10");

        }

        for (String clave : mapaNotas.keySet()) {

            System.out.println(clave);

        }

        for (Integer valor : mapaNotas.values()) {

            System.out.println(valor);

        }

        for (Map.Entry<String, Integer> notas : mapaNotas.entrySet()) {

            System.out.println("Notas de " + notas.getKey() + ": " + notas.getValue());

        }

    }

}
