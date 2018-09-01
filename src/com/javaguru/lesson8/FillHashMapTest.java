package com.javaguru.lesson8;

import java.util.HashMap;

class FillHashMapTest {

    public static void main(String[] args) {
        HashMap<Integer, String> numbersAndWords = new HashMap<>();
        numbersAndWords.put(100, "One hundred");
        numbersAndWords.put(1000, "One thousand");
        numbersAndWords.put(5, "Five");
        numbersAndWords.put(10, "Ten");

        System.out.println("Size: " + numbersAndWords.size());
        System.out.println("Map: " + numbersAndWords);
        System.out.println("Get element 100: " + numbersAndWords.get(100));
        System.out.println("Remove element 5: " + numbersAndWords.remove(5));
        System.out.println("Map: " + numbersAndWords);
        System.out.println("Contains key 5: " + numbersAndWords.containsKey(5));
        System.out.println("Contains key 10: " + numbersAndWords.containsKey(10));
        System.out.println("Keys: " + numbersAndWords.keySet());

        numbersAndWords.put(10, "TEN !!!");
        System.out.println("Map: " + numbersAndWords);
    }
}
