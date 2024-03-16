package com.hm4.AbstractFactory.factory;

import com.hm4.AbstractFactory.macronutrient.Fats;
import com.hm4.AbstractFactory.macronutrient.Macronutrient;
import com.hm4.AbstractFactory.model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FatsFactory implements MacronutrientFactory{
    private static FatsFactory instance;
    private final List<String> allowedFats;

    private FatsFactory() {
        allowedFats = new ArrayList<>(List.of("Avocado", "Sour cream", "Tuna", "Peanuts"));
    }

    public static synchronized FatsFactory getInstance() {
        if (instance == null) {
            instance = new FatsFactory();
        }
        return instance;
    }

    @Override
    public Macronutrient create(Customer customer) {
        List<String> allowedFatsCopy = new ArrayList<>(allowedFats);
        if (customer.getDietPlan().equals("No Restriction")) {
            allowedFatsCopy = new ArrayList<>(allowedFats);
            Random random = new Random();
            String fat = allowedFatsCopy.get(random.nextInt(allowedFatsCopy.size()));
            return new Fats(fat);
        } else if (customer.getDietPlan().equals("Paleo")) {
            // Paleo diet plan doesn't allow any dairy products, including Sour cream
            allowedFatsCopy = new ArrayList<>(allowedFats);
            allowedFatsCopy.remove("Sour cream");
            Random random = new Random();
            String fat = allowedFatsCopy.get(random.nextInt(allowedFatsCopy.size()));
            return new Fats(fat);
        } else if (customer.getDietPlan().equals("Vegan")) {
            // Vegan diet plan doesn't allow any dairy products, including Sour cream
            allowedFatsCopy = new ArrayList<>(allowedFats);
            allowedFatsCopy.remove("Sour cream");
            allowedFatsCopy.remove("Tuna");
            Random random = new Random();
            String fat = allowedFatsCopy.get(random.nextInt(allowedFatsCopy.size()));
            return new Fats(fat);
        } else if (customer.getDietPlan().equals("Nut Allergy")) {
            // Nut Allergy diet plan doesn't allow nuts, including Peanuts
            allowedFatsCopy = new ArrayList<>(allowedFats);
            allowedFatsCopy.remove("Peanuts");
            Random random = new Random();
            String fat = allowedFatsCopy.get(random.nextInt(allowedFatsCopy.size()));
            return new Fats(fat);
        } else {
            // Handle other diet plans or invalid diet plans
            return null;
        }
    }
}

