package com.javaguru.lesson10.rooms;

abstract class AbstractRoom implements Room {

    private String name;

    public AbstractRoom(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
