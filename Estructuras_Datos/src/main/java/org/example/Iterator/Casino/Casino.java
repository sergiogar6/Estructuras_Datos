package org.example.Iterator.Casino;

public class Casino {

    private String juego;
    private double apuesta_minima;

    public Casino(String juego, double apuesta_minima) {
        this.juego = juego;
        this.apuesta_minima = apuesta_minima;
    }

    public String getJuego() {
        return juego;
    }

    public void setJuego(String juego) {
        this.juego = juego;
    }

    public double getApuesta_minima() {
        return apuesta_minima;
    }

    public void setApuesta_minima(double apuesta_minima) {
        this.apuesta_minima = apuesta_minima;
    }
}
