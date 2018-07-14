package com.javaguru.lesson2.console;

import java.util.Random;

class RandomNumbersTest {

    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int firstNumber = randomGenerator.nextInt(101);
        int secondNumber = randomGenerator.nextInt(101);
        int thirdNumber = randomGenerator.nextInt(101);

        int sumResult = firstNumber + secondNumber + thirdNumber;
        int multiplyResult = firstNumber * secondNumber * thirdNumber;
        System.out.println(sumResult);
        System.out.println(multiplyResult);
    }
}
