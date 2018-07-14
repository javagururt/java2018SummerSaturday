package com.javaguru.lesson2;

import java.util.Scanner;

class SquareCalculatorDemo {

    public static void main(String[] args) {
        SquareCalculator calculator = new SquareCalculator();
        int userNumber = getNumberFromUser();
        int squareResult = calculator.calculateSquare(userNumber);
        printResult(squareResult);
    }

    public static int getNumberFromUser() {
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        return userInput;
//        return sc.nextInt();
    }

    public static void printResult(int result) {
        System.out.println("Square result: " + result);
    }
}
