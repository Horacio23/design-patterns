package com.patterns.bridge.shape2;


/**
 * Created by Horacio on 7/19/2016.
 */
public class Shape2BridgeDemo {

    public static void main(String args[]){
        Color blue = new Blue();

        Shape square = new Square(blue);

        Color red = new Red();

        Shape circle = new Circle(red);

        Color green = new Green();

        Shape greenSquare = new Square(green);

        square.applyColor();
        circle.applyColor();
        greenSquare.applyColor();
    }
}
