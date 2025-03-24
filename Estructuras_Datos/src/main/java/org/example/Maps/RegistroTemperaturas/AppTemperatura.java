package org.example.Maps.RegistroTemperaturas;

public class AppTemperatura {
    public static void main(String[] args) {
        RegistroTemperaturas registro = new RegistroTemperaturas();
        registro.insertarTemperatura("Alicante", 32);
        System.out.println(registro);
        registro.actualizarTemperatura("Alicante");
        System.out.println(registro);
        registro.consultarTemperatura();
        System.out.println(registro);
        registro.mostrar();

    }
}
