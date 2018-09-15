package com.javaguru.lesson10.rooms;

class DreamHouseTest {

    public static void main(String[] args) {
        DreamHouseTest testCases = new DreamHouseTest();
        testCases.shouldCalculateTotalArea();
//        List<Room> rooms = new ArrayList<>();
//        rooms.add(squareRoom);
//        rooms.add(livingRoom);
//        rooms.add(dreamRoom);
//        rooms.add(raveRoom);
//        for (int i = 0; i < rooms.size(); i++) {
//            System.out.println(rooms.get(i).calculateArea());
//        }

    }

    public void shouldCalculateTotalArea() {
        DreamHouse dreamHouse = new DreamHouse();
        SquareRoom squareRoom = new SquareRoom("Kindergarden", 10);
        SquareRoom livingRoom = new SquareRoom("Living room", 20);
        CircleRoom dreamRoom = new CircleRoom("Dream room", 10);
        RectangleRoom raveRoom = new RectangleRoom("Rave Room", 2, 5);
        dreamHouse.addRoom(squareRoom);
        dreamHouse.addRoom(livingRoom);
        dreamHouse.addRoom(dreamRoom);
        dreamHouse.addRoom(raveRoom);
        double expectedResult = 824;
        double actualResult = dreamHouse.calculateTotalArea();
        printTestResult(expectedResult == actualResult, "shouldCalculateTotalArea");

    }

    private void printTestResult(boolean result, String testName) {
        if (result) {
            System.out.println(testName + " OK");
        } else {
            System.err.println(testName + " FAIL");
        }
    }
}
