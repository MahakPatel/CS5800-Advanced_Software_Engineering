package com.Final;

public class Main {
    public static void main(String[] args) {
        CPPFoodDelivery platform = new CPPFoodDelivery();
        Registry registry = Registry.getInstance();

        // Creating and registering customers
        Customer customer1 = new Customer("John Doe", "123 Elm St", "LA County", "low-carb");
        Customer customer2 = new Customer("Jane Smith", "456 Oak St", "Orange County", "none");
        Customer customer3 = new Customer("Emily Davis", "789 Pine St", "San Bernardino County", "high-protein");
        Customer customer4 = new Customer("Michael Brown", "101 Maple St", "LA County", "low-fat");
        platform.registerCustomer(customer1);
        platform.registerCustomer(customer2);
        platform.registerCustomer(customer3);
        platform.registerCustomer(customer4);

        // Creating and registering drivers using the Shift enum
        Driver driver1 = new Driver("Alice Johnson", "111 Birch St", "LA County", Shift.FIRST_SHIFT);
        Driver driver2 = new Driver("Bob Brown", "222 Cedar St", "Orange County", Shift.SECOND_SHIFT);
        Driver driver3 = new Driver("Charlie Clark", "333 Elm St", "San Bernardino County", Shift.THIRD_SHIFT);
        Driver driver4 = new Driver("David Evans", "444 Pine St", "LA County", Shift.FIRST_SHIFT);
        platform.registerDriver(driver1);
        platform.registerDriver(driver2);
        platform.registerDriver(driver3);
        platform.registerDriver(driver4);

        // Creating and registering restaurants
        Restaurant restaurant1 = new Restaurant("Taco Place", "321 Birch St", "LA County", "Mexican", "8 AM to 8 PM");
        Restaurant restaurant2 = new Restaurant("Thai Express", "654 Cedar St", "Orange County", "Thai", "10 AM to 10 PM");
        Restaurant restaurant3 = new Restaurant("Healthy Eats", "789 Oak St", "San Bernardino County", "Health Food", "7 AM to 7 PM");

        Meal meal1 = new MealBuilder("Taco").addFats(10).addCarbs(30).addProtein(15).build();
        Meal meal2 = new MealBuilder("Pad Thai").addFats(20).addCarbs(50).addProtein(10).build();
        Meal meal3 = new MealBuilder("Salad").addFats(5).addCarbs(10).addProtein(20).build();

        ToppingAdder tacoWithExtraCheese = new ToppingAdder(meal1);
        tacoWithExtraCheese.addTopping("Extra Cheese");

        restaurant1.addMeal(meal1);
        restaurant2.addMeal(meal2);
        restaurant3.addMeal(meal3);

        platform.registerRestaurant(restaurant1);
        platform.registerRestaurant(restaurant2);
        platform.registerRestaurant(restaurant3);

        // Test case 1: Customer1 ordering from Taco Place
        String orderStatus1 = platform.createOrder("John Doe", "Taco Place", "Taco");
        System.out.println(orderStatus1);

        // Test case 2: Customer2 ordering from Thai Express
        String orderStatus2 = platform.createOrder("Jane Smith", "Thai Express", "Pad Thai");
        System.out.println(orderStatus2);

        // Test case 3: Customer3 ordering from Healthy Eats
        String orderStatus3 = platform.createOrder("Emily Davis", "Healthy Eats", "Salad");
        System.out.println(orderStatus3);

        // Test case 4: Customer4 ordering from Taco Place
        String orderStatus4 = platform.createOrder("Michael Brown", "Taco Place", "Taco");
        System.out.println(orderStatus4);

        // Test case 5: Customer1 ordering from Healthy Eats (handling different counties)
        String orderStatus5 = platform.createOrder("John Doe", "Healthy Eats", "Salad");
        System.out.println(orderStatus5);  // Expected: No drivers available for this county.

        // Test case 6: Customer2 ordering from Taco Place with dietary restriction
        String orderStatus6 = platform.createOrder("Jane Smith", "Taco Place", "Taco");
        System.out.println(orderStatus6);
    }
}

