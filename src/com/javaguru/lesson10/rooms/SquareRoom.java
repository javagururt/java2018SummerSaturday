package com.javaguru.lesson10.rooms;

class SquareRoom extends AbstractRoom {

    private double side;

    public SquareRoom(String name, double side) {
        super(name);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
