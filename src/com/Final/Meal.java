package com.Final;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private String name;
    private int fats, carbs, protein;
    private List<String> toppings = new ArrayList<>();

    public Meal(String name, int fats, int carbs, int protein) {
        this.name = name;
        this.fats = fats;
        this.carbs = carbs;
        this.protein = protein;
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }

    @Override
    public String toString() {
        String toppingList = toppings.isEmpty() ? "None" : String.join(", ", toppings);
        return String.format("%s (Fats: %d, Carbs: %d, Protein: %d, Toppings: %s)", name, fats, carbs, protein, toppingList);
    }
}

