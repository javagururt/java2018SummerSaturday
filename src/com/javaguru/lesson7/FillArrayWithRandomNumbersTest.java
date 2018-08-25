package com.javaguru.lesson7;

import java.util.Random;

public class FillArrayWithRandomNumbersTest {

    public static void main(String[] args) {
        int[] integerArray = createArray(10);
        fillArrayWithRandomNumbers(integerArray);
        printArrayToConsole(integerArray);
    }

    public static int[] createArray(int size) {
        return new int[size];
    }

    public static void fillArrayWithRandomNumbers(int[] integerArray) {
        Random randomGenerator = new Random();
        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = randomGenerator.nextInt(101);
        }
    }

    public static void printArrayToConsole(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }
}
