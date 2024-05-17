package com.Final;

// Abstract base class for adding toppings to meals
public abstract class MealDecorator extends Meal {
    protected Meal meal;

    public MealDecorator(Meal meal) {
        super(meal.toString(), 0, 0, 0);  // dummy values as we use the meal object
        this.meal = meal;
    }

    public abstract void addTopping(String topping);
}

