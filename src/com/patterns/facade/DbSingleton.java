package com.patterns.facade;

import java.sql.Connection;

/**
 * Created by Horacio on 7/22/2016.
 *
 * This class is not necessary for the demo
 * This can be the implementation of any database
 */
public class DbSingleton {
    private static DbSingleton instance = new DbSingleton();

    public static DbSingleton getInstance() {
        return instance;
    }

    public Connection getConnection() {

    }
}
