package com.hm4.AbstractFactory;

import com.hm4.AbstractFactory.factory.*;
import com.hm4.AbstractFactory.meal.*;
import com.hm4.AbstractFactory.model.Customer;

public class Driver {
    public static void main(String[] args) {
        MacronutrientAbstractFactory abstractFactory = MacronutrientAbstractFactory.getInstance();
        MacronutrientMealFactory mealFactory = new MacronutrientMealFactory(abstractFactory);

        // Create customers with different diet plans
        Customer customer1 = new Customer("John", "No Restriction");
        Customer customer2 = new Customer("Ronda Rousey", "Vegan");
        Customer customer3 = new Customer("Seth Rollins", "Paleo");
        Customer customer4 = new Customer("Roman", "Paleo");
        Customer customer5 = new Customer("Kevin", "Vegan");
        Customer customer6 = new Customer("Lita", "Nut Allergy");

        // Generate meals for each customer
        MacronutrientMeal meal1 = mealFactory.createMeal(customer1);
        MacronutrientMeal meal2 = mealFactory.createMeal(customer2);
        MacronutrientMeal meal3 = mealFactory.createMeal(customer3);
        MacronutrientMeal meal4 = mealFactory.createMeal(customer4);
        MacronutrientMeal meal5 = mealFactory.createMeal(customer5);
        MacronutrientMeal meal6 = mealFactory.createMeal(customer6);

        // Print the generated meals
        System.out.println(customer1.getName() + ": Your " + customer1.getDietPlan()+ meal1);
        System.out.println(customer2.getName() + ": Your " + customer2.getDietPlan()+ meal2);
        System.out.println(customer3.getName() + ": Your " + customer3.getDietPlan()+ meal3);
        System.out.println(customer4.getName() + ": Your " + customer4.getDietPlan()+ meal4);
        System.out.println(customer5.getName() + ": Your " + customer5.getDietPlan()+ meal5);
        System.out.println(customer6.getName() + ": Your " + customer6.getDietPlan()+ meal6);
    }
}

