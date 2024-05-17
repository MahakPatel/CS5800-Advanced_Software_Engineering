package com.Final;

import java.util.HashMap;
import java.util.Map;

public class Restaurant {
    private String name;
    private String address;
    private String county;
    private String cuisineType;
    private String operatingHours;
    private Map<String, Meal> menu = new HashMap<>();

    public Restaurant(String name, String address, String county, String cuisineType, String operatingHours) {
        this.name = name;
        this.address = address;
        this.county = county;
        this.cuisineType = cuisineType;
        this.operatingHours = operatingHours;
    }

    public String getName() {
        return name;
    }

    public String getCounty() {
        return county;
    }

    public String getAddress() {
        return address;
    }

    public String getCuisineType() {
        return cuisineType;
    }

    public String getOperatingHours() {
        return operatingHours;
    }


    // Retrieve a specific meal from the menu
    public Meal getMeal(String name) {
        return menu.get(name);
    }
}

