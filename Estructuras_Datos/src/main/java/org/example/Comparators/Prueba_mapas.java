package org.example.Comparators;

import java.util.*;

public class Prueba_mapas {
    public static void main(String[] args) {

        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(12324,"Patricia");
        mapa.put(584993,"Manuel");
        mapa.put(3452,"Raul");

        List<Map.Entry<Integer,String>> listaMapa = new ArrayList<>(mapa.entrySet());
        listaMapa.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        for (Map.Entry<Integer,String> mapa2 : listaMapa) {
            System.out.println("DNI: " + mapa2.getKey() + " con nombre " + mapa2.getValue());
        }

    }

}
