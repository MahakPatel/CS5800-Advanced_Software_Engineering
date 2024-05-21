package com.Final;
import java.util.*;

class Driver extends User {
    private String address;
    private String county;
    private String shift;
    private int shiftStartHour;
    private int shiftEndHour;

    public Driver(String name, String address, String county, String shift, int shiftStartHour, int shiftEndHour) {
        super(name);
        this.address = address;
        this.county = county;
        this.shift = shift;
        this.shiftStartHour = shiftStartHour;
        this.shiftEndHour = shiftEndHour;
    }

    public String getAddress() {
        return address;
    }

    public String getCounty() {
        return county;
    }

    public String getShift() {
        return shift;
    }

    public int getShiftStartHour() {
        return shiftStartHour;
    }

    public int getShiftEndHour() {
        return shiftEndHour;
    }

    public boolean isAvailableDuring(Date time) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(time);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        return hour >= shiftStartHour && hour < shiftEndHour;
    }
}