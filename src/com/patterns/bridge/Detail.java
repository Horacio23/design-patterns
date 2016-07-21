package com.patterns.bridge;

/**
 * Created by Horacio on 7/21/2016.
 */
public class Detail {

    private String label;
    private String value;

    public Detail(String label,String value){
        this.label=label;
        this.value=value;
    }

    public String getLabel() {
        return label;
    }

    public String getValue() {
        return value;
    }
}
