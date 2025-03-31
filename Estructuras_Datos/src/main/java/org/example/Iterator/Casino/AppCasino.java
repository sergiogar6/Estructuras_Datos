package org.example.Iterator.Casino;

import java.util.ArrayList;
import java.util.Iterator;

public class AppCasino {
    public static void main(String[] args) {
        ArrayList<Casino> listaCasino = new ArrayList<>();

        listaCasino.add(new Casino("POKER", 500));
        listaCasino.add(new Casino("RULE", 25));
        listaCasino.add(new Casino("BLACKJACK", 50));

        Iterator<Casino> casinoIt = listaCasino.iterator();

        while (casinoIt.hasNext()) {
            Casino casino = casinoIt.next();
            System.out.println(casino);

            if (casino.getApuesta_minima() > 0.20) {
                casinoIt.remove();
            }

            if (casino.getApuesta_minima() < 30) {
                casinoIt.remove();
            }



        }

    }
}
