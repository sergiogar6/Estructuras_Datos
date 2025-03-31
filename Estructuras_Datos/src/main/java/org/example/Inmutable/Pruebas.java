package org.example.Inmutable;

import java.util.List;

public class Pruebas {
    public static void main(String[] args) {

        Juego pokemon = new Juego("Pokemon Plata",100);
        List<String> listapokemons = pokemon.getPersonajes();

        listapokemons.add("PIkachu");

        pokemon.getPersonajes().add("Squirtle");
        pokemon.getPersonajes().add("Charmander");

        System.out.println(pokemon.getPersonajes());

    }
}
