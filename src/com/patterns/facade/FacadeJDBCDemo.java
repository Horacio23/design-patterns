package com.patterns.facade;

import java.util.List;

/**
 * Created by Horacio on 7/22/2016.
 */
public class FacadeJDBCDemo {
    public static void main(String ...args){
        JdbcFacade jdbcFacade = new JdbcFacade();

        jdbcFacade.createTable();
        System.out.println("Table Created");

        jdbcFacade.insertIntoTable();
        System.out.println("Record inserted");

        List<Address> addresses = jdbcFacade.getAddresses();

        for(Address address: addresses){
            System.out.println(address.getId()+ " "+ address.getStreetName() + " " + address.getCity());
        }
    }
}
