package org.example.Iterator;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Ejercicio {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Escribe un texto");
        String entrada = sc.next();

        LinkedList<Character> texto = new LinkedList<>();
        ListIterator<Character> it = texto.listIterator();

        for (Character c : entrada.toCharArray()) {

            switch (c) {
                case '<':
                    if (it.hasPrevious()) {
                        it.previous();
                    }
                    break;

                case '>':
                    if (it.hasNext()) {
                        it.next();
                    }
                    break;

                case '#':
                    if (it.hasPrevious()) {
                        it.previous();
                        it.remove();
                    }
                    break;

                default:
                    it.add(c);
                    break;
            }

        }

        for (Character c : texto) {
            System.out.print(c);
        }


    }
}
