package com.javaguru.lesson4;

public class SmartWalletTest {

    public static void main(String[] args) {
        SmartWalletTest test = new SmartWalletTest();
        test.addMoneyTest1();
        test.addMoneyTest2();
        test.addMoneyTest3();
        test.redrawMoneyTest1();
        test.redrawMoneyTest2();
        test.redrawMoneyTest3();
        test.redrawMoneyTest4();
    }

    public void addMoneyTest1() {
        int money = 20;
        String securityCode = "xyz";
        SmartWallet smartWallet = new SmartWallet(securityCode);
        boolean result = smartWallet.addMoney(securityCode, money);
        if (result) {
            System.out.println("TEST addMoneyTest1 OK");
        } else {
            System.out.println("TEST addMoneyTest1 FAIL");
        }
    }

    public void addMoneyTest2() {
        int money = 20;
        String securityCode = "xyz";
        SmartWallet smartWallet = new SmartWallet(securityCode);
        boolean result = smartWallet.addMoney("abc", money);
        if (result == false) {
            System.out.println("TEST addMoneyTest2 OK");
        } else {
            System.out.println("TEST addMoneyTest2 FAIL");
        }
    }

    public void addMoneyTest3() {
        int money = -20;
        String securityCode = "xyz";
        SmartWallet smartWallet = new SmartWallet(securityCode);
        boolean result = smartWallet.addMoney(securityCode, money);
        if (result == false) {
            System.out.println("TEST addMoneyTest3 OK");
        } else {
            System.out.println("TEST addMoneyTest3 FAIL");
        }
    }

    public void redrawMoneyTest1() {
        int money = 20;
        String securityCode = "xyz";
        SmartWallet smartWallet = new SmartWallet(securityCode);
        boolean result = smartWallet.redraw(securityCode, money);
        if (result == false) {
            System.out.println("TEST redrawMoneyTest1 OK");
        } else {
            System.out.println("TEST redrawMoneyTest1 FAIL");
        }
    }

    public void redrawMoneyTest2() {
        int money = 20;
        String securityCode = "xyz";
        SmartWallet smartWallet = new SmartWallet(securityCode);
        smartWallet.addMoney(securityCode, money);
        boolean result = smartWallet.redraw(securityCode, money);
        if (result) {
            System.out.println("TEST redrawMoneyTest2 OK");
        } else {
            System.out.println("TEST redrawMoneyTest2 FAIL");
        }
    }

    public void redrawMoneyTest3() {
        int money = 20;
        String securityCode = "xyz";
        SmartWallet smartWallet = new SmartWallet(securityCode);
        smartWallet.addMoney(securityCode, money);
        boolean result = smartWallet.redraw("abc", money);
        if (result == false) {
            System.out.println("TEST redrawMoneyTest3 OK");
        } else {
            System.out.println("TEST redrawMoneyTest3 FAIL");
        }
    }

    public void redrawMoneyTest4() {
        int money = 20;
        String securityCode = "xyz";
        SmartWallet smartWallet = new SmartWallet(securityCode);
        smartWallet.addMoney(securityCode, money);
        boolean result = smartWallet.redraw(securityCode, -20);
        if (result == false) {
            System.out.println("TEST redrawMoneyTest4 OK");
        } else {
            System.out.println("TEST redrawMoneyTest4 FAIL");
        }
    }

}