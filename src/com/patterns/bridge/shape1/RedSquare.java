package com.patterns.bridge.shape1;

/**
 * Created by Horacio on 7/19/2016.
 */
public class RedSquare extends Square {
    @Override
    public void applyColor() {
        System.out.println("Applying red color");
    }
}
