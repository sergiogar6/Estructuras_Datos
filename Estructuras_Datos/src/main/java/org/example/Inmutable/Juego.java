package org.example.Inmutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Juego {
    private String nombre;
    private int nivel;
    private List<String> personajes;

    public Juego(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.personajes = new ArrayList<>();
    }

    public List<String> getPersonajes() {
        return Collections.unmodifiableList(personajes);
    }

    @Override
    public String toString() {
        return "Juego{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", personajes=" + personajes +
                '}';
    }
}
