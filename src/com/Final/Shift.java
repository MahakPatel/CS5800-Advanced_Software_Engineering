package com.Final;

import java.time.LocalTime;

public enum Shift {
    FIRST_SHIFT("8 AM to 4 PM"),
    SECOND_SHIFT("4 PM to 12 AM"),
    THIRD_SHIFT("12 AM to 8 AM");

    private final String availability;

    Shift(String availability) {
        this.availability = availability;
    }

    public String getAvailability() {
        return availability;
    }


}

