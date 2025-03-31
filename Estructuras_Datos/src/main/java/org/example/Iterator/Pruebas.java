package org.example.Iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Pruebas {
    public static void main(String[] args) {

        LinkedList<Integer> numeros = new LinkedList<>(Arrays.asList(10,39,48,3,23,77,41));

        Iterator<Integer> it = numeros.iterator();

        while (it.hasNext()) {

            Integer num = it.next();

            if (num == 10) {
                it.remove();
            }

        }

        System.out.println(numeros);

    }
}
