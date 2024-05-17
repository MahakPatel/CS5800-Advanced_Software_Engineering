package com.Final;

import java.time.LocalTime;
public class CPPFoodDelivery {
    private Registry registry = Registry.getInstance();

    public void registerCustomer(Customer customer) {
        registry.registerCustomer(customer);
    }

    public void registerDriver(Driver driver) {
        registry.registerDriver(driver);
    }

    public void registerRestaurant(Restaurant restaurant) {
        registry.registerRestaurant(restaurant);
    }

    // Helper function to assign drivers based on county and time
    private Driver findAvailableDriver(String county, LocalTime orderTime) {
        for (Driver driver : registry.getDrivers()) {
            if (driver.getCounty().equals(county) && driver.getShift().isWithinShift(orderTime)) {
                return driver;
            }
        }
        return null;
    }

    public String createOrder(String customerName, String restaurantName, String mealName) {
        Customer customer = findCustomerByName(customerName);
        Restaurant restaurant = findRestaurantByName(restaurantName);
        if (customer != null && restaurant != null) {
            Meal meal = restaurant.getMeal(mealName);  // Ensure this method exists in Restaurant
            // Check null on meal as well
            if (meal == null) {
                System.out.println("Meal does not exist in " + restaurantName + " for " + mealName);
                return "Meal does not exist.";
            }

            Order order = new Order();  // Assuming Order constructor and methods are correctly defined
            order.registerObserver(customer); // Observing the order
            order.setStatus("Preparing");

            Driver driver = findAvailableDriver(restaurant.getCounty(), LocalTime.now());
            if (driver != null) {
                order.setStatus("Out for Delivery");
                return String.format("Order created for %s: %s from %s with Driver %s delivering.", customerName, meal, restaurantName, driver.getName());
            } else {
                return "No drivers available for this county.";
            }
        } else {
            return "Order could not be created. Verify customer, restaurant, and meal information.";
        }
    }

    private Customer findCustomerByName(String name) {
        return registry.getCustomers().stream()
                .filter(c -> c.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    private Restaurant findRestaurantByName(String name) {
        return registry.getRestaurants().stream()
                .filter(r -> r.getName().equals(name))
                .findFirst()
                .orElse(null);
    }
}
