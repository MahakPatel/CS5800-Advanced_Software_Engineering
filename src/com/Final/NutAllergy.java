package com.Final;
import java.util.*;

class NutAllergy implements DietaryRestrictionStrategy {
    @Override
    public void applyRestriction(Customer customer, List<String> carbs, List<String> proteins, List<String> fats) {
        System.out.println(customer.getName() + "'s diet plan is Nut Allergy. No Nuts.");
        carbs.remove("Pistachio");
        fats.remove("Peanuts");
    }
}
