package org.example;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(11);
        stack.push(2);
        stack.push(7);

        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());

        while (!stack.isEmpty()) {
            stack.pop();
        }

        System.out.println(stack.peek());


    }
}