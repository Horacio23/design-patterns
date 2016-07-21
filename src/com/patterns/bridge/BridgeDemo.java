package com.patterns.bridge;

/**
 * Created by Horacio on 7/21/2016.
 */
public class BridgeDemo {

    public static void main(String args[]){
        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setTitle("John Wick");
        movie.setRuntime("2:15");
        movie.setYear("2014");

        Formatter printFormatter = new PrintFormatter();
        Printer moviePrinter = new MoviePrinter(movie);

        String printerMaterial = moviePrinter.print(printFormatter);

        System.out.println(printerMaterial);
    }
}
