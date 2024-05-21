package com.Final;
import java.util.*;

// Singleton Pattern for managing user registration
class UserRegistry {
    private static UserRegistry instance;
    private List<User> users;

    private UserRegistry() {
        users = new ArrayList<>();
    }

    public static UserRegistry getInstance() {
        if (instance == null) {
            instance = new UserRegistry();
        }
        return instance;
    }

    public void registerUser(User user) {
        users.add(user);
        if (user instanceof Restaurant) {
            Restaurant restaurant = (Restaurant) user;
            System.out.println(restaurant.getName() + " has been registered with CPPFoodDelivery.");
            System.out.println("Address: " + restaurant.getAddress());
            System.out.println("County: " + restaurant.getCounty());
            System.out.println("Operating Hours: " + restaurant.getOperatingHours());
            System.out.println("Cuisine Type: " + restaurant.getCuisineType());
            System.out.println("Menu: " + restaurant.getMenuWithPrices());
            System.out.println("Optional Meal Toppings: " + restaurant.getToppingsWithPrices());
        } else if (user instanceof Driver) {
            Driver driver = (Driver) user;
            System.out.println(driver.getName() + " has been registered with CPPFoodDelivery.");
            System.out.println("Address: " + driver.getAddress());
            System.out.println("Shift: " + driver.getShift() + " (" + driver.getShiftStartHour() + ":00 - " + driver.getShiftEndHour() + ":00)");
            System.out.println("Operating County: " + driver.getCounty());
        } else if (user instanceof Customer) {
            Customer customer = (Customer) user;
            System.out.println(customer.getName() + " has been registered with CPPFoodDelivery.");
            System.out.println("Address: " + customer.getAddress());
            System.out.println("County: " + customer.getCounty());
        } else {
            System.out.println(user.getName() + " has been registered with CPPFoodDelivery.");
        }
    }
}
