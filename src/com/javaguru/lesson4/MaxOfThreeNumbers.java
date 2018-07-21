package com.javaguru.lesson4;

public class MaxOfThreeNumbers {

    public int findMax(int x, int y, int z) {
        if (x >= y && x >= z) {
            return x;
        }
        if (y >= x && y >= z) {
            return y;
        } else {
            return z;
        }
    }

}
