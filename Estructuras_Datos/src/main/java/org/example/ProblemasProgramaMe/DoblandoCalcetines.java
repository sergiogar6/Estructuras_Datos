package org.example.ProblemasProgramaMe;

import java.util.HashSet;

public class DoblandoCalcetines {
    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        int casoDePrueba = in.nextInt();
        in.nextLine();
        if (casoDePrueba == 0)
        return false;
        else {

            String[] calcetines = in.nextLine().split(" ");
            HashSet<Integer> mesa = new HashSet<>();
            int maxSinEmparejar = 0;

            for (int i = 0; i < casoDePrueba; i++) {

                int calcetin = Integer.parseInt(calcetines[i]);

                if (mesa.contains(calcetin)) {

                    mesa.remove(calcetin);

                } else {

                    mesa.add(calcetin);

                }

                maxSinEmparejar = Math.max(maxSinEmparejar, mesa.size());

            }

            System.out.println(maxSinEmparejar);

            return true;
        }
    } // casoDePrueba

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main
}
