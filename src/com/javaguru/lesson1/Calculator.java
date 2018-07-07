package com.javaguru.lesson1;

import java.util.Scanner;

class Calculator {

    public void sum() {
        System.out.println("Please enter number: ");

        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();

        System.out.println("Please enter number: ");
        int secondNumber = sc.nextInt();

        int sumResult = firstNumber + secondNumber;
        System.out.println(sumResult);
    }
}
