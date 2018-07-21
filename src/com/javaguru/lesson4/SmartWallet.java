package com.javaguru.lesson4;

public class SmartWallet {

    private int money;
    private String securityCode;

    public SmartWallet(String securityCode) {
        this.securityCode = securityCode;
        this.money = 0;
    }

    public boolean redraw(String securityCode, int money) {
        if (isSecurityCodeValid(securityCode)
                && isMoneyPositive(money)
                && this.money - money >= 0) {
            this.money = this.money - money;
            return true;
        } else {
            return false;
        }
    }

    public boolean addMoney(String securityCode, int money) {
        if (isSecurityCodeValid(securityCode)
                && isMoneyPositive(money)) {
            //this.money += money;
            this.money = this.money + money;
            return true;
        } else {
            return false;
        }
    }

    private boolean isMoneyPositive(int money) {
        return money > 0;
    }

    private boolean isSecurityCodeValid(String securityCode) {
        return this.securityCode.equals(securityCode);
    }

}
