package com.patterns.bridge.shape2;

/**
 * Created by Horacio on 7/19/2016.
 */
public class Square extends Shape{
    public Square(Color color){
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }


}
