package org.example.Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Pruebas {
    public static void main(String[] args) {

        Set<Character> letras = new HashSet<>();

        letras.add('a');
        letras.add('g');
        letras.add('b');
        letras.add('n');
        letras.add('a');

        System.out.println(letras);

        System.out.println("-------------------");

        Set<Character> letras_enlazadas = new LinkedHashSet<>();
        letras_enlazadas.add('z');
        letras_enlazadas.add('b');
        letras_enlazadas.add('g');


        System.out.println(letras_enlazadas.add('z'));
        System.out.println(letras_enlazadas);

        System.out.println("-------------------");

        Set<Character> letras_ordenadas = new TreeSet<>();

        letras_ordenadas.add('a');
        letras_ordenadas.add('j');
        letras_ordenadas.add('b');
        letras_ordenadas.add('c');

        System.out.println(letras_ordenadas);

    }
}
