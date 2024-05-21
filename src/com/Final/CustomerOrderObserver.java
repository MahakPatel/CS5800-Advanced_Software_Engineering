package com.Final;

class CustomerOrderObserver implements OrderObserver {
    private String name;

    public CustomerOrderObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Order order) {
        System.out.println("Customer " + name + " received an update about their order: " + order.getRestaurant().getName() +
                " has prepared " + ". It's on the way with " + order.getDriver().getName() +
                ". Estimated delivery time: " + order.getOrderDeliveredTime());
    }
}