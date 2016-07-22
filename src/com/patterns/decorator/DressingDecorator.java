package com.patterns.decorator;

/**
 * Created by Horacio on 7/22/2016.
 */
public class DressingDecorator extends SandwichDecorator {
    public DressingDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    public String make(){
        return customSandwich.make() + addDressing();
    }

    private String addDressing(){
        return " + mayo";
    }
}
