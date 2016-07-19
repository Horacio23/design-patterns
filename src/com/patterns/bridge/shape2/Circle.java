package com.patterns.bridge.shape2;

/**
 * Created by Horacio on 7/19/2016.
 */
public class Circle extends Shape {

    public Circle(Color color){
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
