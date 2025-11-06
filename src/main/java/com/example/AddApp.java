package com.example;

public class AddApp {
    // simple pure function for addition (easy to unit test)
    public static int add(int a, int b) {
        return a + b;
    }

    // runnable entrypoint: expects two integer args
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Usage: java -jar add-app.jar <int a> <int b>");
            System.exit(1);
        }
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(add(a, b));
        } catch (NumberFormatException e) {
            System.err.println("Both arguments must be integers");
            System.exit(2);
        }
    }
}
