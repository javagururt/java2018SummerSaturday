package com.javaguru.lesson7;

class TwoDimensionalArrayTest {

    public static void main(String[] args) {
        int[][] twoDimensionalArray = ArrayUtils.createTwoDimensionArray(5,5);
        ArrayUtils.printArrayToConsole(twoDimensionalArray);
        ArrayUtils.fillMultiplicationTable(twoDimensionalArray);
        System.out.println();
        ArrayUtils.printArrayToConsole(twoDimensionalArray);
    }
}
