package org.example.Practica1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Mercadam {
    static Random random = new Random();
    private static final String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static List<Cliente> clientes;

    public Mercadam() {
        clientes = new ArrayList<>();
        generarClientes();
    }

    static void generarClientes() {

        for (int i = 0; i < random.nextInt(10)+5; i++) {

            String user = "";
            String pass = "";

            for (int j = 0; j < 8; j++) {

                int indexUser = random.nextInt(caracteres.length());
                int indexPass = random.nextInt(caracteres.length());

                user += caracteres.charAt(indexUser);
                pass += caracteres.charAt(indexPass);

            }

            Cliente cliente = new Cliente(user, pass);
            clientes.add(cliente);

        }

    }

    public List<Cliente> getClientes() {
        return Collections.unmodifiableList(clientes);
    }

}
