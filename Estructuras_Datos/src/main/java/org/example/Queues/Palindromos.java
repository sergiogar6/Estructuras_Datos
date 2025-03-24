package org.example.Queues;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Palindromos {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String palabra = sc.nextLine();

        Deque<Character> palindromo = new LinkedList<>();

        for (int i = 0; i < palabra.length(); i++) {
            palindromo.offer(palabra.charAt(i));
        }

        esPolindromo(palindromo);

    }

    public static boolean esPolindromo(Deque<Character> palindromo) {

        while (!palindromo.isEmpty()) {
            if (palindromo.peekFirst() == palindromo.peekLast()) {
                palindromo.pollFirst();
                palindromo.pollLast();
            } else {
                System.out.println("LA PALABRA NO ES");
                return false;
            }
        }

        System.out.println("LA PALABRA ES UN PALINDROMO");
        return true;
    }


}
