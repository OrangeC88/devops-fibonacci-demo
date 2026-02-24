package com.example;

public class Main {

    public static void main(String[] args) {

        int number = 10; // default

        if (args.length > 0) {
            try {
                number = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Please provide a valid integer.");
                return;
            }
        }

        int result = fibonacci(number);

        System.out.println("Fibonacci of " + number + " is: " + result);
    }

    public static int fibonacci(int n) {

        if (n == 0) return 0;
        if (n == 1) return 1;

        int prev = 0;
        int current = 1;

        for (int i = 2; i <= n; i++) {
            int next = prev + current;
            prev = current;
            current = next;
        }

        return current;
    }
}