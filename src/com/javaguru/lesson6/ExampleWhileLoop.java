package com.javaguru.lesson6;

import java.util.Scanner;

class ExampleWhileLoop {

    public static final int SECRET_KEY = 4234;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int userInput = scanner.nextInt();

            if (userInput == SECRET_KEY) {
                System.out.println("Success!");
                break;
            }

            System.out.println("Fail");
        }
    }
}
