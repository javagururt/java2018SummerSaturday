package com.javaguru.lesson8;

import java.util.ArrayList;

public class FillArrayListToEndTest {

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        long start = System.currentTimeMillis();
        fillArrayList(integers);
        long finish = System.currentTimeMillis();
        long result = finish - start;
        System.out.println("Result: " + result + " ms");
    }

    public static void fillArrayList(ArrayList<Integer> integers) {
        for (int i = 0; i < 100_000; i++) {
            integers.add(i);
        }
    }
}
