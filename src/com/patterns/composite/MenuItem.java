package com.patterns.composite;

/**
 * Created by Horacio on 7/21/2016.
 */
public class MenuItem extends MenuComponent{

    public MenuItem(String name, String url){
        this.name = name;
        this.url = url;
    }

    @Override
    public String toString() {
        return print(this);
    }
}
