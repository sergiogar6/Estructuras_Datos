package org.example.ProblemasProgramaMe;

import java.util.HashSet;
import java.util.Set;

public class NumerosCubinfinitos {
    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        int numero = in.nextInt();
        in.nextLine();
        if (numero == 0)
        return false;
        else {
            Set<Integer> vistos = new HashSet<>();
            StringBuilder secuencia = new StringBuilder();
            int actual = numero;

            while (true) {
                if (!secuencia.isEmpty()) {
                    secuencia.append(" - ");
                }
                secuencia.append(actual);

                if (actual == 1) {
                    secuencia.append(" -> cubifinito.");
                    break;
                }

                if (vistos.contains(actual)) {
                    secuencia.append(" -> no cubifinito.");
                    break;
                }

                vistos.add(actual);

                int sumaCubos = 0;
                int temp = actual;
                while (temp > 0) {
                    int digito = temp % 10;
                    sumaCubos += digito * digito * digito;
                    temp /= 10;
                }
                actual = sumaCubos;
            }

            System.out.println(secuencia);


            return true;
        }
    } // casoDePrueba

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main
}
