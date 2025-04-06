package org.example.Practica1;

import java.util.*;

public class Pedido {

    private HashMap<Producto, Integer> pedido;
    private double importeTotal;

    public Pedido() {
        this.pedido = new HashMap<>();
    }

    public HashMap<Producto, Integer> getPedido() {
        return pedido;
    }

    public void setPedido(HashMap<Producto, Integer> pedido) {
        this.pedido = pedido;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }

    public void aplicarPromo3x2() {
        for (Map.Entry<Producto, Integer> pedido : pedido.entrySet()) {
           if (pedido.getValue() % 3 == 0) {
               this.importeTotal -= pedido.getKey().getPrecio() * (pedido.getValue() / 3);
           }
        }
    }

    public void aplicarPromo10() {
        this.importeTotal -= (this.importeTotal* 0.1);
    }

    public void mostrarPedido() {

        System.out.println("\n================================\n");
        System.out.println("RESUMEN DE TU CARRITO DE COMPRA\n");

        System.out.println("Productos:");
        for (Map.Entry<Producto, Integer> pedido : pedido.entrySet()) {
            System.out.println("    " + pedido.getValue() + " " + pedido.getKey() + " " + pedido.getKey().getPrecio());
        }

        System.out.println("\nIMPORTE TOTAL: " + this.importeTotal + "€");
        System.out.println("\n================================\n");

    }

    public void mostrarPedidoOrdenado() {

        System.out.println("\n ================================");
        System.out.println("RESUMEN DE TU CARRITO DE COMPRA");
        System.out.println("Ordenado por uds");
        System.out.println("\nProductos: \n");

        List<Map.Entry<Producto,Integer>> listaPedido = new ArrayList<>(pedido.entrySet());
        Collections.sort(listaPedido, new CompararCantidad().reversed());

        for (Map.Entry<Producto, Integer> pedido : listaPedido) {
            System.out.println(pedido.getValue() + " " + pedido.getKey() + " " + pedido.getKey().getPrecio());
        }

        System.out.println("IMPORTE TOTAL: " + this.importeTotal + "€");
        System.out.println("\n========================================\n");
    }

}
