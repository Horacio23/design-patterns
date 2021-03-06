package com.patterns.decorator;

/**
 * Created by Horacio on 7/22/2016.
 */
public class MeatDecorator extends SandwichDecorator {

    public MeatDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    public String make(){
        return customSandwich.make() + addMeat();
    }

    private String addMeat(){
        return " + turkey";
    }
}
