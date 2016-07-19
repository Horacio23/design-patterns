package com.patterns.bridge.shape2;

/**
 * Created by Horacio on 7/19/2016.
 */
public class Red implements Color {
    @Override
    public void applyColor() {
        System.out.println("Applying red color");
    }
}
