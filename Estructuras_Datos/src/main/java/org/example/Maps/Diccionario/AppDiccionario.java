package org.example.Maps.Diccionario;

public class AppDiccionario {
    public static void main(String[] args) {
        Diccionario diccionario = new Diccionario();
        //Nuevo Par
        diccionario.nuevoPar("Hola", "Hello");
        diccionario.nuevoPar("Pelota", "Ball");

        //Traducir
        System.out.println("Palabra hola traducida:");
        System.out.println(diccionario.traduce("Hola"));
        System.out.println();

        //Palabra Aleatoria
        System.out.println("Palabra aleatoria:");
        System.out.println(diccionario.palabraAleatoria());
        System.out.println();

        //Primera Letra Traduccion
        System.out.println("Palabra en español: Pelota");
        System.out.print("Primera letra de la palabra en ingles: ");
        System.out.println(diccionario.primeraLetraTraduccion("Pelota"));

    }
}
