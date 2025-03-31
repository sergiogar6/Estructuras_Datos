package org.example.Practica1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Mercadam {
    static Random random = new Random();
    private final String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static List<Cliente> clientes;

    public Mercadam() {
        clientes = new ArrayList<>();
        generarClientes();
    }

    static void generarClientes() {

    }

    static List<Cliente> getClientes() {
        return Collections.unmodifiableList(clientes);
    }

}
