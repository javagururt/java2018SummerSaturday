package com.javaguru.lesson10.rooms;

import java.util.ArrayList;
import java.util.List;

class DreamHouse {

    private List<AbstractRoom> rooms;

    public DreamHouse() {
        rooms = new ArrayList<>();
    }

    public double calculateTotalArea() {
        double totalArea = 0;
        for (int i = 0; i < rooms.size(); i++) {
            totalArea += rooms.get(i).calculateArea();
        }
        return totalArea;
    }

    public void printAllRoomNames() {
        for (int i = 0; i < rooms.size(); i++) {
            System.out.println(rooms.get(i).getName());
        }
    }

    public void addRoom(AbstractRoom room) {
        rooms.add(room);
    }
}
