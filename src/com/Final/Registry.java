package com.Final;

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

public class Registry {
    private static Registry instance = null;
    private Map<String, Customer> customers = new HashMap<>();
    private Map<String, Driver> drivers = new HashMap<>();
    private Map<String, Restaurant> restaurants = new HashMap<>();

    private Registry() {}

    public static Registry getInstance() {
        if (instance == null) {
            instance = new Registry();
        }
        return instance;
    }

    public void registerCustomer(Customer customer) {
        customers.put(customer.getName(), customer);
    }

    public Collection<Customer> getCustomers() {
        return customers.values();
    }

    public void registerDriver(Driver driver) {
        drivers.put(driver.getName(), driver);
    }



    public void registerRestaurant(Restaurant restaurant) {
        restaurants.put(restaurant.getName(), restaurant);
    }

    public Collection<Restaurant> getRestaurants() {
        return restaurants.values();
    }
}
