package com.Final;
import java.util.*;

class Paleo implements DietaryRestrictionStrategy {
    @Override
    public void applyRestriction(Customer customer, List<String> carbs, List<String> proteins, List<String> fats) {
        System.out.println(customer.getName() + "'s diet plan is Paleo. No Carbs except pistachio, No Tofu, No Dairy.");
        carbs.removeIf(item -> !item.equals("Pistachio"));
        proteins.remove("Tofu");
        fats.removeAll(Arrays.asList("Cheese", "Sour cream"));
    }
}