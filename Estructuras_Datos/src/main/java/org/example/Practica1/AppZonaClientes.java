package org.example.Practica1;

import java.util.List;
import java.util.Scanner;

public class AppZonaClientes {
    private static Cliente cliente;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Mercadam mercadam = new Mercadam();

        System.out.println("*** COMPRA ONLINE DE MERCADAM***");
        System.out.println();

        boolean sesionIniciada = autenticacion(mercadam.getClientes());

        if (sesionIniciada) {

            iniciarCompra();
            String continuar = "s";

            do {


            imprimirProductos();

            System.out.print("Elige un producto: ");
            String productoElegido = sc.next();
            System.out.println("\n================================\n");

            boolean productoExiste = cliente.insertarProducto(productoElegido);

            if (productoExiste) {
                continuar = sc.next();
            }

            } while (continuar.equalsIgnoreCase("s"));

            cliente.getPedido().mostrarPedido();

            String opcion;
            do {
                System.out.println("¿QUÉ DESEA HACER? \n");
                System.out.println("[1]. Aplicar promo.");
                System.out.println("[2]. Mostrar resumen ordenado por uds.");
                System.out.println("[3]. Terminar pedido.");

                System.out.println("\n================================\n");
                System.out.println("Elige una opcion: ");
                opcion = sc.next();

                System.out.println("\n================================\n");

                switch (opcion) {
                    case "1":
                        if (!cliente.isPromociones()) {
                            cliente.setPromociones(true);
                            cliente.getPedido().aplicarPromo3x2();
                            cliente.getPedido().aplicarPromo10();
                            System.out.println("PROMO 3X2 Y 10% APLICADAS");
                            cliente.getPedido().mostrarPedido();
                        } else {
                            System.out.println("YA HAS APLICADO TUS PROMOS");
                        }
                        break;

                    case "2":
                        cliente.getPedido().mostrarPedidoOrdenado();
                        break;

                    case "3":
                        imprimirDespedida();
                        break;

                    default:
                        System.out.println("OPCION NO VALIDA");
                        break;

                }

            } while (!opcion.equalsIgnoreCase("3"));


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

    }

    public static void imprimirProductos() {

        System.out.println("Añade productos a tu lista de la compra...");
        System.out.println();

        for (Producto producto : Producto.values()) {
            System.out.println(producto + " precio (" + producto.getPrecio() + "€),");
        }

        System.out.println("\n================================\n");

    }

    public static void imprimirDespedida() {
        System.out.println("GRACIAS POR SU PEDIDO. Se lo mandaremos a la direccion " + cliente.getDireccion());
    }

}
