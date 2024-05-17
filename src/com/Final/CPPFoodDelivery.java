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
