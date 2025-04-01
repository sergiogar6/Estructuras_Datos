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

    static void insertarProducto() {

    }

    static double importePedido() {

        return 0;
    }


}
