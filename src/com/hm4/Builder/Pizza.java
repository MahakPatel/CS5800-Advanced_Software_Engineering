package com.hm4.Builder;

import java.util.ArrayList;
import java.util.List;

class Pizza {
    private String size;
    private String chain; // Add the pizza chain
    private List<String> toppings;

    // Constructor
    public Pizza(String chain) {
        this.chain = chain;
        this.toppings = new ArrayList<>();
    }

    // Getters and Setters
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public List<String> getToppings() {
        return toppings;
    }

    // Method for adding toppings
    public void addTopping(String topping) {
        toppings.add(topping);
    }

    // The eat method
    public void eat() {
        System.out.println(chain + " - Enjoy your " + size + " pizza with:");
        for (String topping : toppings) {
            System.out.println("- " + topping);
        }
    }
}

