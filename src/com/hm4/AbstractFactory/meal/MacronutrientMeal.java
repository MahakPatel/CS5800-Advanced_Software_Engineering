package com.hm4.AbstractFactory.meal;

import com.hm4.AbstractFactory.macronutrient.*;

public class MacronutrientMeal {
    private Carbs carbs;
    private Protein protein;
    private Fats fats;

    public MacronutrientMeal(Carbs carbs, Protein protein, Fats fats) {
        this.carbs = carbs;
        this.protein = protein;
        this.fats = fats;
    }

    public Carbs getCarbs() {
        return carbs;
    }

    public Protein getProtein() {
        return protein;
    }

    public Fats getFats() {
        return fats;
    }

    @Override
    public String toString() {
        return " Meal has: " +
                "\n   " + carbs +
                ",\n   " + protein +
                ",\n   " + fats ;
    }
}
