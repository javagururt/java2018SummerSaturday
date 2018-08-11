package com.javaguru.lesson5;

class LightBulb {

    public static final int MAX_TURN_ON_COUNT = 5;

    private boolean turnedOn;
    private int turnOnCount;

    public void turnOn() {
        if (turnedOn == false && turnOnCount < MAX_TURN_ON_COUNT) { // if (!turnedOn) { ...
            turnOnCount = turnOnCount + 1; //turnOnCount++
            turnedOn = true;
            System.out.println("Turned on, " + "count = " + turnOnCount);
        } else {
            System.out.println("Unable to turn on");
        }

    }

    public void turnOff() {
        if (turnedOn) {
            turnedOn = false;
            System.out.println("Turned off");
        } else {
            System.out.println("Already turned off");
        }
    }
}
