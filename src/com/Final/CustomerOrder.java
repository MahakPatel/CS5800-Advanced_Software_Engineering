package com.Final;

import java.util.*;

// Class to represent the Customer's Order
class CustomerOrder {
    private List<FoodItem> foodItems = new ArrayList<>();
    private Customer customer;

    public CustomerOrder(Customer customer) {
        this.customer = customer;
    }

    public void addFoodItem(FoodItem foodItem) {
        foodItems.add(foodItem);
    }

    public double calculateTotalCost() {
        double total = 0;
        for (FoodItem foodItem : foodItems) {
            total += foodItem.getCost();
        }
        return total;
    }

    public List<FoodItem> getFoodItems() {
        return foodItems;
    }
}