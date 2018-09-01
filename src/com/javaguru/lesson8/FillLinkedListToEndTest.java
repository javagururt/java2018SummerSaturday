package com.javaguru.lesson8;

import java.util.LinkedList;

class FillLinkedListToEndTest {

    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        long start = System.currentTimeMillis();
        fillArrayList(integers);
        long finish = System.currentTimeMillis();
        long result = finish - start;
        System.out.println("Result: " + result + " ms");
    }

    public static void fillArrayList(LinkedList<Integer> integers) {
        for (int i = 0; i < 10_000_000; i++) {
            integers.add(i);
        }
    }
}
