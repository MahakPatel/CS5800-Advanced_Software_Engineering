package com.Final;
import java.util.*;

class Vegan implements DietaryRestrictionStrategy {
    @Override
    public void applyRestriction(Customer customer, List<String> carbs, List<String> proteins, List<String> fats) {
        System.out.println(customer.getName() + "'s diet plan is Vegan. No Meat and No Dairy.");
        proteins.removeAll(Arrays.asList("Fish", "Chicken", "Beef"));
        fats.removeAll(Arrays.asList("Cheese", "Sour cream", "Tuna"));
    }
}