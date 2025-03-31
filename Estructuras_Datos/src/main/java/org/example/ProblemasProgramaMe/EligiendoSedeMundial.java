package org.example.ProblemasProgramaMe;

import java.util.HashMap;
import java.util.Map;

public class EligiendoSedeMundial {
    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        int casoPrueba = in.nextInt();
        in.nextLine();
        if (casoPrueba == 0)
            return false;
        else {
            String[] paises = in.nextLine().split(" ");
            HashMap<String, Integer> votos = new HashMap<>();

            for (String pais : paises) {

                if (votos.containsKey(pais)) {
                    votos.put(pais, votos.get(pais)+1);
                } else {
                    votos.put(pais, 1);
                }

            }

            String resultado = "";
            Integer temp = 0;

            for (Map.Entry<String, Integer> voto : votos.entrySet()) {
                if (voto.getValue() > temp) {
                    temp = voto.getValue();
                    resultado = voto.getKey();
                } else if (voto.getValue().equals(temp)) {
                    resultado = "EMPATE";
                }
            }

            System.out.println(resultado);

            return true;
        }
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }
}
