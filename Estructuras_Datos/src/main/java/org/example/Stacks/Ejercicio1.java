package org.example.Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Ejercicio1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(ejercicio3());
    }

    public static void ejercicio1() {
        Stack<Character> stack_char = new Stack<>();
        stack_char.push('a');
        stack_char.push('d');
        stack_char.push('j');
        stack_char.push('v');
        stack_char.push('t');

        if (stack_char.isEmpty()) {
            System.out.println("La pila esta vacia");
        }

        System.out.println("Hay " + stack_char.size() + " elementos en la pila");
        System.out.println("Ultimo elemento: " + stack_char.peek());

        while (!stack_char.isEmpty()) {
            System.out.println(stack_char.pop());
        }
    }

    public static void ejercicio2() {
        Stack<Integer> stack = new Stack<>();

        System.out.print("Introduce el primer número: ");
        stack.push(sc.nextInt());

        System.out.print("Introduce el segundo número: ");
        stack.push(sc.nextInt());

        System.out.print("Introduce el tercer número: ");
        stack.push(sc.nextInt());

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static boolean ejercicio3() {
        String cadena = sc.nextLine();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '(') {
                stack.push(cadena.charAt(i));

            } else if (cadena.charAt(i) == ')' && !stack.isEmpty()) {
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
