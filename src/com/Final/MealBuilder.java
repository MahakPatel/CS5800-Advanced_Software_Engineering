package com.Final;

public class MealBuilder {
    private String name;
    private int fats, carbs, protein;

    public MealBuilder(String name) {
        this.name = name;
    }

    // Fluent interface to add fats
    public MealBuilder addFats(int fats) {
        this.fats = fats;
        return this;
    }

    // Fluent interface to add carbs
    public MealBuilder addCarbs(int carbs) {
        this.carbs = carbs;
        return this;
    }

    // Fluent interface to add protein
    public MealBuilder addProtein(int protein) {
        this.protein = protein;
        return this;
    }

    // Constructs and returns the final Meal object
    public Meal build() {
        return new Meal(name, fats, carbs, protein);
    }
}
