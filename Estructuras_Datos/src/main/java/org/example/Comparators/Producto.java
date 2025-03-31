package org.example.Comparators;

import java.util.Objects;

public class Producto  {

    private String nombre;
    private Integer precio;

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return precio == producto.precio && Objects.equals(nombre, producto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio);
    }

//    @Override
//    // si es 0, objeto1 = objeto2
//    // si es <0, objeto1 < objeto2
//    // si es >0, objeto1 > objeto2
//    public int compareTo(Producto o) {
//        int comparacionNombre = nombre.compareTo(o.nombre);
//
//        if (comparacionNombre != 0) {
//            return comparacionNombre;
//        }
//
//        return precio.compareTo(o.precio);
//    }
}
