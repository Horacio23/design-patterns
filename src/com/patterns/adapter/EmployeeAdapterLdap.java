package com.patterns.adapter;
/**
 * Created by Horacio on 7/16/2016.
 */
public class EmployeeAdapterLdap implements Employee {

    private EmployeeLdap instance;

    public EmployeeAdapterLdap(EmployeeLdap instance){
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getSurname();
    }

    @Override
    public String getLastName() {
        return instance.getGivenName();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }
}
