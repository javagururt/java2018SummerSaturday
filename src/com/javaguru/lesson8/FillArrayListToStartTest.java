package com.javaguru.lesson8;

import java.util.ArrayList;

class FillArrayListToStartTest {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        long start = System.currentTimeMillis();
        fillArrayList(integers);
        long finish = System.currentTimeMillis();
        long result = finish - start;
        System.out.println("Result: " + result + " ms");
    }

    public static void fillArrayList(ArrayList<Integer> integers) {
        for (int i = 0; i < 500_000; i++) {
            integers.add(0, i);
        }
    }
}
