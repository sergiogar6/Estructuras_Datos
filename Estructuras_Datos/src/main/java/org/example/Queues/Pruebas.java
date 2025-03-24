package org.example.Queues;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Pruebas {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayBlockingQueue<>(2);

        queue.offer(9);
        queue.offer(4);


        Queue<Integer> queue1 = new LinkedList<>();

        queue1.offer(1);
        queue1.offer(2);
        queue1.offer(3);

        System.out.println(queue1.poll());

        System.out.println(queue1.peek());

        System.out.println("--------------------------------");

        Deque<Integer> double_queue = new LinkedList<>();

        double_queue.offer(3);
        double_queue.offerFirst(6);
        double_queue.offerLast(10);
        double_queue.offer(130);


        System.out.println(double_queue);

    }
}
