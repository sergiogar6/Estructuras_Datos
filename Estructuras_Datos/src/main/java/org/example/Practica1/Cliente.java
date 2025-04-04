package org.example.Practica1;

import java.util.Random;

public class Cliente {

    private String usuario;
    private String contraseña;
    private Pedido pedido;
    private boolean promociones;
    private String direccion;


    public Cliente(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.pedido = null;
        this.promociones = false;
        this.direccion = "Calle falsa, 123";
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "usuario='" + usuario + '\'' +
                ", contraseña='" + contraseña + '\'' +
                ", pedido=" + pedido +
                ", promociones=" + promociones +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    static void crearPedido() {

    }

    public void insertarProducto(String producto) {

        boolean productoExiste = false;

        for (Producto producto1 : Producto.values()) {
            if (producto1.name().equals(producto)) {
                productoExiste = true;
                break;
            }
        }

        if (productoExiste) {
            pedido.getPedido().put(Producto.valueOf(producto), pedido.getPedido().getOrDefault(Producto.valueOf(producto), 0)+1);

        } else {
            System.out.println("El producto no existe! Elige otro.");
        }
    }

    static double importePedido() {
        double total;


        return 0;

    }


}
