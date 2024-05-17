package com.Final;

public class Main {
    public static void main(String[] args) {
        CPPFoodDelivery platform = new CPPFoodDelivery();
        Registry registry = Registry.getInstance();

        // Creating and registering customers
        Customer customer1 = new Customer("John Doe", "123 Elm St", "LA County", "low-carb");


        // Creating and registering drivers using the Shift enum
        Driver driver1 = new Driver("Alice Johnson", "111 Birch St", "LA County", Shift.FIRST_SHIFT);


        // Creating and registering restaurants
        Restaurant restaurant1 = new Restaurant("Taco Place", "321 Birch St", "LA County", "Mexican", "8 AM to 8 PM");
        Restaurant restaurant2 = new Restaurant("Thai Express", "654 Cedar St", "Orange County", "Thai", "10 AM to 10 PM");
        Restaurant restaurant3 = new Restaurant("Healthy Eats", "789 Oak St", "San Bernardino County", "Health Food", "7 AM to 7 PM");

        Meal meal1 = new MealBuilder("Taco").addFats(10).addCarbs(30).addProtein(15).build();


        ToppingAdder tacoWithExtraCheese = new ToppingAdder(meal1);
        tacoWithExtraCheese.addTopping("Extra Cheese");

        restaurant1.addMeal(meal1);


        platform.registerRestaurant(restaurant1);
        platform.registerRestaurant(restaurant2);
        platform.registerRestaurant(restaurant3);

        // Test case 1: Customer1 ordering from Taco Place
        String orderStatus1 = platform.createOrder("John Doe", "Taco Place", "Taco");
        System.out.println(orderStatus1);


    }
}

