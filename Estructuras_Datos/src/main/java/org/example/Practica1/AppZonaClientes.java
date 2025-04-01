package org.example.Practica1;

import java.util.List;

public class AppZonaClientes {
    private static Cliente cliente;

    public static void main(String[] args) {
        Mercadam mercadam = new Mercadam();

        System.out.println("*** COMPRA ONLINE DE MERCADAM***");
        System.out.println();
        autenticacion(mercadam.getClientes());

    }


    public static void autenticacion(List<Cliente> clientes) {
        for (int i = 0; i < 3; i++) {
            
        }
    }

    public void iniciarCompra() {

    }

    public void imprimirProductos() {

    }

    public void imprimirDespedida() {

    }

}
