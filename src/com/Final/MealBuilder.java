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


    // Constructs and returns the final Meal object
    public Meal build() {
        return new Meal(name, fats, carbs, protein);
    }
}
