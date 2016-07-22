package com.patterns.decorator;

/**
 * Created by Horacio on 7/22/2016.
 */
public class DecoratorSandwichDemo {

    public static void main(String ...args){
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));

        System.out.println(sandwich.make());
    }
}
