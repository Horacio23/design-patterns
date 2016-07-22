package com.patterns.decorator;

/**
 * Created by Horacio on 7/22/2016.
 */
public class SimpleSandwich implements Sandwich {
    @Override
    public String make() {
        return "Bread";
    }
}
