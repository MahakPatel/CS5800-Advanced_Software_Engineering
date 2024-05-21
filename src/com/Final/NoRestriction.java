package com.Final;
import java.util.*;

class NoRestriction implements DietaryRestrictionStrategy {
    @Override
    public void applyRestriction(Customer customer, List<String> carbs, List<String> proteins, List<String> fats) {
        System.out.println(customer.getName() + "'s diet plan is No Restriction. All food items are allowed.");
    }
}
