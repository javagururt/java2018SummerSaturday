package com.javaguru.lesson5;

class SwitcherTest {

    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        LightBulb lightBulb = new LightBulb();

        switcher.connect(lightBulb);

        switcher.turnOn();
        switcher.turnOff();
        switcher.turnOn();
        switcher.turnOff();
        switcher.turnOn();
        switcher.turnOff();
        switcher.turnOn();
        switcher.turnOn();
        switcher.turnOff();
        switcher.turnOn();
        switcher.turnOff();
        switcher.turnOn();
        switcher.turnOff();
        switcher.turnOn();

    }
}
