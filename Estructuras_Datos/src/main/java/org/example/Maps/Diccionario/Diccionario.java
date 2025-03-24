package org.example.Maps.Diccionario;

import java.util.*;

public class Diccionario {
    static Random random = new Random();
    private HashMap<String, String> diccionario = new HashMap<>();

    public Diccionario() {
        this.diccionario = new HashMap<>();
    }

    public void nuevoPar(String esp, String eng) {
        diccionario.put(esp, eng);
    }

    public String traduce(String esp) {

        if (diccionario.containsKey(esp)) {
            return diccionario.get(esp);
        } else {
            return "Palabra no encontrada";
        }

    }

    public String palabraAleatoria() {

        int randomNumber = random.nextInt(diccionario.size());

        ArrayList<String> listaKeys = new ArrayList<>(diccionario.keySet());

        return listaKeys.get(randomNumber);

    }

    public Character primeraLetraTraduccion(String esp) {
        return diccionario.get(esp).charAt(0);
    }

    @Override
    public String toString() {
        return "Diccionario{" +
                "diccionario=" + diccionario +
                '}';
    }
}
