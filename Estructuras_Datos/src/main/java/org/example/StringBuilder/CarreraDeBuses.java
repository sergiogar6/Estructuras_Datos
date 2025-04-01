package org.example.StringBuilder;

import java.util.Random;

public class CarreraDeBuses {

    public static final int TAM = 97;
    static Random random = new Random();

    public static void main(String[] args) throws InterruptedException {

        int a = 0; // POSICIÓN INICIAL DEL AUTOBÚS
        int b = 0;
        System.out.println("\n<<<<<<<<<< AUTOBUSITO >>>>>>>>>>");
        Thread.sleep(3000);

        while (a < TAM && b < TAM) {
            a += random.nextInt(3)+1;
            b += random.nextInt(3)+1; // avanzamos
            limpiarPantalla();

            if (a<TAM && b<TAM) {
                System.out.println(dibujarCarrera(a, b));
                Thread.sleep(70);
            }
        }

        if (a > b) { System.out.println("EL AUTOBUS DAM ES EL GANADOR");}
        else if (b > a) { System.out.println("EL AUTOBUS DAW ES EL GANADOR");}
        else {System.out.println("Empate"); }

        System.out.println("\033[32m"+ "EL AUTOBUSITO HA LLEGADO A SU DESTINO!!" + "\033[0m");

    }

    public static String dibujarCarrera(int n1, int n2) {

        StringBuilder sb = new StringBuilder();
        sb.append("-".repeat(117)).append("\n");
        sb.append(" ".repeat(n1)).append("_______________ ").append(" ".repeat(100 - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|       DAM       |)").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append("-".repeat(117)).append("\n");
        sb.append(" ".repeat(n2)).append("_______________ ").append(" ".repeat(100 - n2)).append("|\n");
        sb.append(" ".repeat(n2)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n2)).append("|\n");
        sb.append(" ".repeat(n2)).append("|       DAW       |)").append(" ".repeat(TAM - n2)).append("|\n");
        sb.append(" ".repeat(n2)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n2)).append("|\n");
        sb.append("_".repeat(117));
        return sb.toString();
    }

    public static void limpiarPantalla() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }

}
