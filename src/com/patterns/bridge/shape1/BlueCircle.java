package com.patterns.bridge.shape1;

/**
 * Created by Horacio on 7/19/2016.
 */
public class BlueCircle extends Circle {
    @Override
    public void applyColor() {
        System.out.println("Applying blue color");
    }
}
