package com.Final;

abstract class FoodItemDecorator implements FoodItem {
    protected FoodItem foodItem;

    public FoodItemDecorator(FoodItem foodItem) {
        this.foodItem = foodItem;
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription();
    }

    @Override
    public double getCost() {
        return foodItem.getCost();
    }
}