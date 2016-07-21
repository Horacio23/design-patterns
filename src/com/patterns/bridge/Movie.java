package com.patterns.bridge;

/**
 * Created by Horacio on 7/21/2016.
 */
public class Movie {

    private String year;
    private String runtime;
    private String title;
    private String classification;


    public void setClassification(String classification) {
        this.classification = classification;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public void setYear(String year) {
        this.year = year;
    }


    public String getClassification() {
        return classification;
    }

    public String getTitle() {
        return title;
    }

    public String getRuntime() {
        return runtime;
    }

    public String getYear() {
        return year;
    }
}
