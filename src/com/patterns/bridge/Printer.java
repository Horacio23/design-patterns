package com.patterns.bridge;

import java.util.List;

/**
 * Created by Horacio on 7/21/2016.
 */
public abstract class Printer {
    public String print(Formatter formatter){
        return formatter.format(getHeader(), getDetails());
    }

    abstract protected List<Detail> getDetails();

    abstract protected String getHeader();

}
