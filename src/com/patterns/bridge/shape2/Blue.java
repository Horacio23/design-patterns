package com.patterns.bridge.shape2;

/**
 * Created by Horacio on 7/19/2016.
 */
public class Blue implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying blue color");
    }
}
