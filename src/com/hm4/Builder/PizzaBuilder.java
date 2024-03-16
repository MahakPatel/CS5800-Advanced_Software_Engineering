package com.hm4.Builder;

public interface PizzaBuilder {
    void setSize(String size);
    void addPepperoni();
    void addSausage();
    void addMushrooms();
    void addBacon();
    void addOnions();
    void addExtraCheese();
    void addPeppers();
    void addChicken();
    void addOlives();
    void addSpinach();
    void addTomatoAndBasil();
    void addBeef();
    void addHam();
    void addPesto();
    void addSpicyPork();
    void addHamAndPineapple();

    Pizza build();
}
