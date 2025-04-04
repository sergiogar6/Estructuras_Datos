package org.example.Practica1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AppZonaClientes {
    private static Cliente cliente;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Mercadam mercadam = new Mercadam();

        System.out.println("*** COMPRA ONLINE DE MERCADAM***");
        System.out.println();
        System.out.println(mercadam.getClientes());
        boolean sesionIniciada = autenticacion(mercadam.getClientes());
        if (sesionIniciada) {
            iniciarCompra();

            System.out.print("Elige un producto;");
            String productoElegido = sc.next();
            System.out.println("========================");

            cliente.insertarProducto(productoElegido);


        }


    }


    public static boolean autenticacion(List<Cliente> clientes) {

        for (int i = 0; i < 3; i++) {

            System.out.print("Usuario: ");
            String user = sc.nextLine();
            System.out.print("Contraseña: ");
            String pass = sc.nextLine();

            System.out.println();

            for (Cliente client : clientes) {

                if (client.getUsuario().equals(user) && client.getContraseña().equals(pass)) {

                    cliente = client;

                    System.out.println("BIENVENID@ " + user);
                    return true;

                }

            }

            if (i != 2) {
                System.out.println("Algo no coincide o no existe! Vuelve a intentarlo...");
            } else {
                System.out.println("ERROR DE AUTENTICACION");
            }

        }

        return false;

    }

    public static void iniciarCompra() {
        cliente.setPedido(new Pedido());

        imprimirProductos();

    }

    public static void imprimirProductos() {

        System.out.println("Añade productos a tu lista de la compra...");
        System.out.println();

        for (Producto producto : Producto.values()) {
            System.out.println(producto + " precio (" + producto.getPrecio() + "€),");
            System.out.println();
        }

        System.out.println("==========================");

    }

    public static void imprimirDespedida() {

    }

}
