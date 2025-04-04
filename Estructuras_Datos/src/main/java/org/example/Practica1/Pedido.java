package org.example.Practica1;

import java.util.HashMap;

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
}
