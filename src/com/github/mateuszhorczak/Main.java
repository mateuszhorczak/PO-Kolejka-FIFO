package com.github.mateuszhorczak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int value, value2;

        System.out.println("Enter a capacity of queue");
        value = scanner.nextInt();
        System.out.println("Enter your N");
        value2 = scanner.nextInt();

        if (value <= value2) {
            return; //TODO n wieksze niz capacity Exception jakies walnac
        }
        Queue q1 = new Queue(value, value2);

        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("Add an element: 1");
            System.out.println("Remove an element: 2");
            System.out.println("Show first element: 3");
            System.out.println("Exit: 4");
            value = scanner.nextInt();

            switch(value) {
                case 1:
                    System.out.println("Enter a value");
                    value = scanner.nextInt();
                    q1.offer(value);
                    break;
                case 2:
                    System.out.println("Removing: " + q1.poll());
                    break;
                case 3:
                    System.out.println("First item is: " + q1.peek());
                    break;
                case 4:
                    return;
            }
        }
    }
}
