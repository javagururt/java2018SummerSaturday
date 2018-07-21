package com.javaguru.lesson4;

public class MaxOfThreeNumbersTest {

    public static void main(String[] args) {
        MaxOfThreeNumbersTest test = new MaxOfThreeNumbersTest();
        test.test1();
        test.test2();
        test.test3();
    }

    public void test1() {
        int x = 1;
        int y = 2;
        int z = 3;

        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int maxNumber = maxOfThreeNumbers.findMax(x, y, z);

        if (maxNumber == 3) {
            System.out.println("TEST 1 OK");
        } else {
            System.out.println("TEST 1 FAIL");
        }
    }

    public void test2() {
        int x = 1;
        int y = 1;
        int z = 1;

        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int maxNumber = maxOfThreeNumbers.findMax(x, y, z);

        if (maxNumber == 1) {
            System.out.println("TEST 2 OK");
        } else {
            System.out.println("TEST 2 FAIL");
        }
    }

    public void test3() {
        int x = 8;
        int y = 8;
        int z = 1;

        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int maxNumber = maxOfThreeNumbers.findMax(x, y, z);

        if (maxNumber == 8) {
            System.out.println("TEST 3 OK");
        } else {
            System.out.println("TEST 3 FAIL");
        }
    }

}
