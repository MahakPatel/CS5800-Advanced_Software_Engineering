package com.Final;

import java.util.*;

class BasicFoodItem implements FoodItem {
    private String description;
    private double cost;

    public BasicFoodItem(String description, double cost) {
        this.description = description;
        this.cost = cost;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getCost() {
        return cost;
    }
}