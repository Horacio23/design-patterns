package com.patterns.adapter;

import java.util.List;

/**
 * Created by Horacio on 7/16/2016.
 */
public class AdapterDemo {
    public static void main(String[] args){
        EmployeeClient client =  new EmployeeClient();

        List<Employee> employees = client.getEmployeeList();

        System.out.println(employees);
    }
}
