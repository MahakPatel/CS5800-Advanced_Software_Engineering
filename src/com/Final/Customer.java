package com.Final;
import java.util.*;

// Customer Class with Dietary Restrictions
class Customer extends User {
    private String address;
    private String county;
    private DietaryRestrictionStrategy dietaryRestrictionStrategy;

    public Customer(String name, String address, String county) {
        super(name);
        this.address = address;
        this.county = county;
    }

    public String getAddress() {
        return address;
    }

    public String getCounty() {
        return county;
    }

    public void setDietaryRestrictionStrategy(DietaryRestrictionStrategy strategy) {
        this.dietaryRestrictionStrategy = strategy;
    }

    public DietaryRestrictionStrategy getDietaryRestrictionStrategy() {
        return dietaryRestrictionStrategy;
    }

    public void applyDietaryRestriction(List<String> carbs, List<String> proteins, List<String> fats) {
        if (dietaryRestrictionStrategy != null) {
            dietaryRestrictionStrategy.applyRestriction(this, carbs, proteins, fats);
        }
    }
}