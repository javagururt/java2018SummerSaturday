package com.javaguru.lesson2;

class HamsterDemo {

    public static void main(String[] args) {
        Hamster hamster = new Hamster();
        hamster.setAge(1);
        hamster.setColor("Ginger");
        hamster.setName("King");
        hamster.setWeight(7);

        System.out.println(hamster.getAge());
        System.out.println(hamster.getColor());
        System.out.println(hamster.getName());
        System.out.println(hamster.getWeight());
        System.out.println(hamster.isAlive());
    }
}
