package com.javaguru.lesson7;

import static com.javaguru.lesson7.ArrayUtils.*;

class ArrayUtilsTest {

    public static void main(String[] args) {
        int[] integerArray = createArray(10);
        fillArrayWithRandomNumbers(integerArray);
        printArrayToConsole(integerArray);
        int sumResult = sumArray(integerArray);
        System.out.println(sumResult);
        double averageResult = arrayAverage(integerArray);
        System.out.println(averageResult);
    }
}
