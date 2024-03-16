package com.hm4.AbstractFactory.factory;

import com.hm4.AbstractFactory.macronutrient.Carbs;
import com.hm4.AbstractFactory.macronutrient.Macronutrient;
import com.hm4.AbstractFactory.model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarbsFactory implements MacronutrientFactory{
    private static CarbsFactory instance;
    private final List<String> allowedCarbs;

    private CarbsFactory() {
        allowedCarbs = new ArrayList<>(List.of("Cheese", "Bread", "Lentils", "Pistachio"));
    }

    public static synchronized CarbsFactory getInstance() {
        if (instance == null) {
            instance = new CarbsFactory();
        }
        return instance;
    }

    @Override
    public Macronutrient create(Customer customer) {
        List<String> allowedCarbsCopy = new ArrayList<>(allowedCarbs);
        if (customer.getDietPlan().equals("No Restriction")) {
            allowedCarbsCopy = new ArrayList<>(allowedCarbs);
            Random random = new Random();
            String carb = allowedCarbsCopy.get(random.nextInt(allowedCarbsCopy.size()));
            return new Carbs(carb);
        } else if (customer.getDietPlan().equals("Paleo")) {
            return new Carbs("Pistachio");
        } else if (customer.getDietPlan().equals("Vegan")) {
            // Vegan diet plan doesn't allow any dairy products, including Cheese
            allowedCarbsCopy = new ArrayList<>(allowedCarbs);
            allowedCarbsCopy.remove("Cheese");
            Random random = new Random();
            String carb = allowedCarbsCopy.get(random.nextInt(allowedCarbsCopy.size()));
            return new Carbs(carb);
        } else if (customer.getDietPlan().equals("Nut Allergy")) {
            // Nut Allergy diet plan doesn't allow nuts, including Pistachio
            allowedCarbsCopy = new ArrayList<>(allowedCarbs);
            allowedCarbsCopy.remove("Pistachio");
            Random random = new Random();
            String carb = allowedCarbsCopy.get(random.nextInt(allowedCarbsCopy.size()));
            return new Carbs(carb);
        } else {
            // Handle other diet plans or invalid diet plans
            return null;
        }
    }

}

