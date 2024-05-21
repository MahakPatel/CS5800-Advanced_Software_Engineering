package com.Final;

class ToppingDecorator extends FoodItemDecorator {
    private String topping;
    private double toppingCost;

    public ToppingDecorator(FoodItem foodItem, String topping, double toppingCost) {
        super(foodItem);
        this.topping = topping;
        this.toppingCost = toppingCost;
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription() + ", " + topping;
    }

    @Override
    public double getCost() {
        return foodItem.getCost() + toppingCost;
    }
}