package com.Final;

public class Driver {
    private String name;
    private String address;
    private String county;
    private Shift shift;

    public Driver(String name, String address, String county, Shift shift) {
        this.name = name;
        this.address = address;
        this.county = county;
        this.shift = shift;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCounty() {
        return county;
    }

    public Shift getShift() {
        return shift;
    }

    public String getShiftAvailability() {
        return shift.getAvailability();
    }
}


