package com.patterns.bridge.shape1;

/**
 * Created by Horacio on 7/19/2016.
 */
public class Shape1BridgeDemo {
    public static void main(String args[]){
        Circle circle = new BlueCircle();

        Square square = new RedSquare();

        Square greenSquare = new GreenSquare();

        circle.applyColor();
        square.applyColor();
        greenSquare.applyColor();
    }
}
