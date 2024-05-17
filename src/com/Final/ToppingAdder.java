package com.Final;

// Concrete decorator class to add toppings dynamically
public class ToppingAdder extends MealDecorator {
    public ToppingAdder(Meal meal) {
        super(meal);
    }


}
