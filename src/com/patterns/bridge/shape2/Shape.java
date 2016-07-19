package com.patterns.bridge.shape2;

/**
 * Created by Horacio on 7/19/2016.
 */
public abstract class Shape {
    protected Color color;

    public Shape(Color color){
        this.color = color;
    }

    abstract public void applyColor();
}
