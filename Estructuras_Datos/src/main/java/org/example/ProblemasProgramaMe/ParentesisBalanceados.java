package org.example.ProblemasProgramaMe;

import java.util.Stack;

public class ParentesisBalanceados {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        if (!in.hasNext())
            return false;
        else {
            String cadena = in.nextLine();
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < cadena.length(); i++) {

                if (cadena.charAt(i) == '(' || cadena.charAt(i) == '[' ||cadena.charAt(i) == '{') {

                    stack.push(cadena.charAt(i));

                } else if (cadena.charAt(i) == ')' || cadena.charAt(i) == ']' ||cadena.charAt(i) == '}') {
                    if (!stack.isEmpty())
                        stack.pop();
                }
            }

            if (stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        return true;
    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

}
