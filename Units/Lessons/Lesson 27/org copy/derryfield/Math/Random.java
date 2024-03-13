package org.derryfield.Math;

public class Random {
    public static int getRandom(int maxValue) {
        // return random integar that ranges from 1 to maxValue
        double r = Math.random() * maxValue;
        int value = (int)r;
        // add 1 so it ranges from 1 to max value
        value++;
        return value;
    }
}
