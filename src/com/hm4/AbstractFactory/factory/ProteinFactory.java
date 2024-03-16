package com.hm4.AbstractFactory.factory;

import com.hm4.AbstractFactory.macronutrient.Macronutrient;
import com.hm4.AbstractFactory.macronutrient.Protein;
import com.hm4.AbstractFactory.model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProteinFactory implements MacronutrientFactory{
    private static ProteinFactory instance;
    private final List<String> allowedProteins;

    private ProteinFactory() {
        allowedProteins = new ArrayList<>(List.of("Fish", "Chicken", "Beef", "Tofu"));
    }

    public static synchronized ProteinFactory getInstance() {
        if (instance == null) {
            instance = new ProteinFactory();
        }
        return instance;
    }

    @Override
    public Macronutrient create(Customer customer) {
        List<String> allowedProteinsCopy = new ArrayList<>(allowedProteins);
        if (customer.getDietPlan().equals("No Restriction")) {
            allowedProteinsCopy = new ArrayList<>(allowedProteins);
            Random random = new Random();
            String protein = allowedProteinsCopy.get(random.nextInt(allowedProteinsCopy.size()));
            return new Protein(protein);
        } else if (customer.getDietPlan().equals("Vegan")) {
            // Vegan diet plan doesn't allow any meat products
            allowedProteinsCopy = new ArrayList<>(allowedProteins);
            allowedProteinsCopy.remove("Fish");
            allowedProteinsCopy.remove("Chicken");
            Random random = new Random();
            String protein = allowedProteinsCopy.get(random.nextInt(allowedProteinsCopy.size()));
            return new Protein(protein);
        } else if (customer.getDietPlan().equalsIgnoreCase("Paleo")) {
            // Paleo diet plan restricts certain protein sources
            allowedProteinsCopy = new ArrayList<>(allowedProteins);
            allowedProteinsCopy.remove("Tofu");
            Random random = new Random();
            String protein = allowedProteinsCopy.get(random.nextInt(allowedProteinsCopy.size()));
            return new Protein(protein);
        } else if (customer.getDietPlan().equalsIgnoreCase("Nut Allergy")) {
            // Nut Allergy diet plan excludes nuts
            allowedProteinsCopy = new ArrayList<>(allowedProteins);
            Random random = new Random();
            String protein = allowedProteinsCopy.get(random.nextInt(allowedProteinsCopy.size()));
            return new Protein(protein);
        }else {
            // Handle other diet plans or invalid diet plans
            return null;
        }
    }
}
