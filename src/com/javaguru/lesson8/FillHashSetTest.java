package com.javaguru.lesson8;

import java.util.HashSet;
import java.util.Scanner;

class FillHashSetTest {

    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("B");
        strings.add("A");
        strings.add("F");
        strings.add("G");
        strings.add("A");
        strings.add("B");

        System.out.println("Set: " + strings);
        System.out.println("Remove: " + strings.remove("A"));
        System.out.println("Set: " + strings);
        System.out.println("Size: " + strings.size());

    }
}
