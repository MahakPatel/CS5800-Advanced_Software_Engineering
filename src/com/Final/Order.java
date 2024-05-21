package com.Final;
import java.util.*;
class Order {
    private Restaurant restaurant;
    private Customer customer;
    private String dietaryRestriction;
    private List<FoodItem> foodItems;
    private Driver driver;
    private Date orderCreationTime;
    private Date orderPickUpTime;
    private Date orderDeliveredTime;
    private List<OrderObserver> observers = new ArrayList<>();

    public Order(Restaurant restaurant, Customer customer, String dietaryRestriction, List<FoodItem> foodItems, Driver driver, Date orderCreationTime) {
        this.restaurant = restaurant;
        this.customer = customer;
        this.dietaryRestriction = dietaryRestriction;
        this.foodItems = foodItems;
        this.driver = driver;
        this.orderCreationTime = orderCreationTime;
    }

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(this);
        }
    }

    public void setOrderPickUpTime(Date orderPickUpTime) {
        this.orderPickUpTime = orderPickUpTime;
    }

    public void setOrderDeliveredTime(Date orderDeliveredTime) {
        this.orderDeliveredTime = orderDeliveredTime;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getDietaryRestriction() {
        return dietaryRestriction;
    }

    public List<FoodItem> getFoodItems() {
        return foodItems;
    }

    public Driver getDriver() {
        return driver;
    }

    public Date getOrderCreationTime() {
        return orderCreationTime;
    }

    public Date getOrderPickUpTime() {
        return orderPickUpTime;
    }

    public Date getOrderDeliveredTime() {
        return orderDeliveredTime;
    }
}