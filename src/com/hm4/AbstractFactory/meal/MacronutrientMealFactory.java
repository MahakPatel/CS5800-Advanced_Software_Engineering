package com.hm4.AbstractFactory.meal;

import com.hm4.AbstractFactory.factory.*;
import com.hm4.AbstractFactory.macronutrient.*;
import com.hm4.AbstractFactory.model.Customer;

public class MacronutrientMealFactory {
    private MacronutrientAbstractFactory abstractFactory;

    public MacronutrientMealFactory(MacronutrientAbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
    }

    public MacronutrientMeal createMeal(Customer customer) {
        Carbs carbs = (Carbs) abstractFactory.createCarbsFactory().create(customer);
        Protein protein = (Protein) abstractFactory.createProteinFactory().create(customer);
        Fats fats = (Fats) abstractFactory.createFatsFactory().create(customer);

        return new MacronutrientMeal(carbs, protein, fats);
    }
}
