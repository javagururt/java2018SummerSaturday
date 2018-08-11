package com.javaguru.lesson5;

class Switcher {

    private boolean turnedOn;
    private LightBulb lightBulb;

    public void connect(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    public void turnOn() {
        if (!turnedOn) {
            turnedOn = true;
            if (lightBulb != null) {
                lightBulb.turnOn();
            }
        }
    }

    public void turnOff() {
        if (turnedOn) {
            turnedOn = false;
            if (lightBulb != null) {
                lightBulb.turnOff();
            }
        }
    }
}
