package com.Final;
import java.util.*;

// Diet Plan Definitions
interface DietaryRestrictionStrategy {
    void applyRestriction(Customer customer, List<String> carbs, List<String> proteins, List<String> fats);
}
