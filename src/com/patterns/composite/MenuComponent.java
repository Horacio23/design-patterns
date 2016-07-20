package com.patterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Horacio on 7/21/2016.
 */
public abstract class MenuComponent {
    String name;
    String url;
    List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();

    public String getName(){
        return name;
    }

    public String getUrl(){
        return url;
    }

    public abstract String toString();

    public MenuComponent add(MenuComponent menuComponent){
        throw new UnsupportedOperationException("Feature not implemented at this level");
    }

    public MenuComponent remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException("Feature not implemented at this level");
    }

    String print(MenuComponent menuComponent){
        StringBuilder builder = new StringBuilder(name);
        builder.append(": ");
        builder.append(url);
        builder.append("\n");
        return builder.toString();
    }


}
