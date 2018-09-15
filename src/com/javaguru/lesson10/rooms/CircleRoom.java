package com.javaguru.lesson10.rooms;

class CircleRoom extends AbstractRoom {

    private double radius;

    public CircleRoom(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14 * (radius * radius);
    }
}
