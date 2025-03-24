package org.example.Maps.RegistroTemperaturas;

import org.example.TareasFuncionario.Informe;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RegistroTemperaturas {
    static Scanner sc = new Scanner(System.in);
    private HashMap<String, Integer> mapaTemperaturas;

    public RegistroTemperaturas() {
        mapaTemperaturas = new HashMap<>();
    }

    public void insertarTemperatura(String ciudad, Integer temperatura) {
        mapaTemperaturas.put(ciudad, temperatura);
    }

    public void actualizarTemperatura(String ciudad) {
        System.out.println("Inserta la temperatura de " + ciudad + ": ");
        mapaTemperaturas.put(ciudad, sc.nextInt());
    }

    public void consultarTemperatura() {
        System.out.println("Introduce la ciudad a consultar: ");
        String ciudad = sc.next();
        if (mapaTemperaturas.containsKey(ciudad)) {
            System.out.println("La temperatura en " + ciudad + " es de " + mapaTemperaturas.get(ciudad));
        } else {
            System.out.println("La ciudad de " + ciudad + " no tiene temperaturas registradas");
        }
    }

    public void mostrar() {
        for (Map.Entry<String, Integer> mapa : mapaTemperaturas.entrySet()) {
            System.out.println(mapa.getKey() + ": " + mapa.getValue() + "º");
        }
    }

    @Override
    public String toString() {
        return "RegistroTemperaturas{" +
                "mapaTemperaturas=" + mapaTemperaturas +
                '}';
    }
}
