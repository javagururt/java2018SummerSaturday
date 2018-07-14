package com.javaguru.lesson2.console;

import java.util.Scanner;

class CalculateSquare {

    public static void main(String[] args) {
        System.out.println("Please enter number: ");

        Scanner input = new Scanner(System.in);
        int userNumber = input.nextInt();

        int squareResult = userNumber * userNumber;

        System.out.println(squareResult);
    }
}
