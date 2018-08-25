package com.javaguru.lesson7;

import java.util.Random;

class ArrayUtils {

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

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    public static double arrayAverage(int[] array) {
        double sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum / array.length;
    }
}
