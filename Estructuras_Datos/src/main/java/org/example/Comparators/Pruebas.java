package org.example.Comparators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Pruebas {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(3,1,45,23,5));
        Collections.sort(numeros);

        System.out.println(numeros);

        ArrayList<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Producto("Sudadera", 6));
        listaProductos.add(new Producto("Pan",1));
        listaProductos.add(new Producto("Arroz",4));

        Collections.sort(listaProductos, new CompararPorPrecio());
        System.out.println(listaProductos);
    }
}
