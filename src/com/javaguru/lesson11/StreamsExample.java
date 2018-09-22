package com.javaguru.lesson11;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

class StreamsExample {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("E");
        strings.add("E");
        strings.add("E");
        strings.add("W");
        strings.add("Z");
        strings.add("Z");
        strings.add("Z");
        strings.add("N");
        strings.add("N");
        strings.add("N");
        strings.add("B");
        strings.add("C");
        strings.add("C");
        strings.add("C");
        strings.add("Y");
        strings.add("Y");
        strings.add("Y");
        strings.add("D");

        strings.stream()
                .sorted()
                .map(s -> s.toLowerCase())
                .forEach(s -> System.out.println(s));

        Set<String> uqStrings = strings.stream()
                .map(s -> s.toLowerCase())
                .collect(Collectors.toSet());

        System.out.println(uqStrings);

        Optional<String> optionalString = strings.stream()
                .filter(s -> s.equalsIgnoreCase("O"))
                .findFirst();
        String result = optionalString
                .orElseThrow(() -> new RuntimeException("O not found"));
        System.out.println(result);
    }
}
