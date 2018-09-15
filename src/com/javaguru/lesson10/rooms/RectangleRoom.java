package com.javaguru.lesson10.rooms;

class RectangleRoom extends AbstractRoom {

    private double length;
    private double width;

    public RectangleRoom(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

}
