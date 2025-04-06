package org.example.Practica1;

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

    public String getDireccion() {
        return direccion;
    }

    public boolean isPromociones() {
        return promociones;
    }

    public void setPromociones(boolean promociones) {
        this.promociones = promociones;
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

    public boolean insertarProducto(String producto) {

        boolean productoExiste = false;

        for (Producto producto1 : Producto.values()) {
            if (producto1.name().equals(producto)) {
                productoExiste = true;
                break;
            }
        }

        if (productoExiste) {
            //el importe total se actualiza
            this.pedido.setImporteTotal(this.pedido.getImporteTotal() + Producto.valueOf(producto).getPrecio());
            //se añade el producto a la lista y en caso de ya estar se suma uno a su valor.
            pedido.getPedido().put(Producto.valueOf(producto), pedido.getPedido().getOrDefault(Producto.valueOf(producto), 0)+1);
            System.out.println("Has añadido " + producto + " con un precio de " + Producto.valueOf(producto).getPrecio() +
                    "€. Importe total del carrito: " + this.importePedido() + "€. Quieres añadir mas productos a tu carrito de la compra? (S/N)");

        } else {
            System.out.println("El producto no existe! Elige otro.");
        }
        return productoExiste;
    }

    public double importePedido() {

        return pedido.getImporteTotal();

    }


}
