package com.hm4.Builder;

import com.hm4.Builder.PizzaBuilder;

public class ConcreteBuilders {
    static class PizzaHutPizzaBuilder implements PizzaBuilder {
        private Pizza pizza;

        public PizzaHutPizzaBuilder() {
            this.pizza = new Pizza("Pizza Hut"); // Create a Pizza Hut pizza
        }

        @Override
        public void setSize(String size) {
            pizza.setSize(size);
        }

        @Override
        public void addPepperoni() {
            pizza.addTopping("Pepperoni");
        }

        @Override
        public void addSausage() {
            pizza.addTopping("Sausage");
        }

        @Override
        public void addMushrooms() {
            pizza.addTopping("Mushrooms");
        }

        @Override
        public void addBacon() {
            pizza.addTopping("Bacon");
        }

        @Override
        public void addOnions() {
            pizza.addTopping("Onions");
        }

        @Override
        public void addExtraCheese() {
            pizza.addTopping("ExtraCheese");
        }

        @Override
        public void addPeppers() {
            pizza.addTopping("Peppers");
        }

        @Override
        public void addChicken() {
            pizza.addTopping("Chicken");
        }

        @Override
        public void addOlives() {
            pizza.addTopping("Olives");
        }

        @Override
        public void addSpinach() {
            pizza.addTopping("Spinach");
        }

        @Override
        public void addTomatoAndBasil() {
            pizza.addTopping("TomatoAndBasil");
        }

        @Override
        public void addBeef() {
            pizza.addTopping("Beef");
        }

        @Override
        public void addHam() {
            pizza.addTopping("Ham");
        }

        @Override
        public void addPesto() {
            pizza.addTopping("Pesto");
        }

        @Override
        public void addSpicyPork() {
            pizza.addTopping("SpicyPork");
        }

        @Override
        public void addHamAndPineapple() {
            pizza.addTopping("HamAndPineapple");
        }

        @Override
        public Pizza build() {
            return pizza;
        }
    }

    static class LittleCaesarsPizzaBuilder implements PizzaBuilder {
        private Pizza pizza;

        public LittleCaesarsPizzaBuilder() {
            this.pizza = new Pizza("LittleCaesars"); // Create a Pizza Hut pizza
        }

        @Override
        public void setSize(String size) {
            pizza.setSize(size);
        }

        @Override
        public void addPepperoni() {
            pizza.addTopping("Pepperoni");
        }

        @Override
        public void addSausage() {
            pizza.addTopping("Sausage");
        }

        @Override
        public void addMushrooms() {
            pizza.addTopping("Mushrooms");
        }

        @Override
        public void addBacon() {
            pizza.addTopping("Bacon");
        }

        @Override
        public void addOnions() {
            pizza.addTopping("Onions");
        }

        @Override
        public void addExtraCheese() {
            pizza.addTopping("ExtraCheese");
        }

        @Override
        public void addPeppers() {
            pizza.addTopping("Peppers");
        }

        @Override
        public void addChicken() {
            pizza.addTopping("Chicken");
        }

        @Override
        public void addOlives() {
            pizza.addTopping("Olives");
        }

        @Override
        public void addSpinach() {
            pizza.addTopping("Spinach");
        }

        @Override
        public void addTomatoAndBasil() {
            pizza.addTopping("TomatoAndBasil");
        }

        @Override
        public void addBeef() {
            pizza.addTopping("Beef");
        }

        @Override
        public void addHam() {
            pizza.addTopping("Ham");
        }

        @Override
        public void addPesto() {
            pizza.addTopping("Pesto");
        }

        @Override
        public void addSpicyPork() {
            pizza.addTopping("SpicyPork");
        }

        @Override
        public void addHamAndPineapple() {
            pizza.addTopping("HamAndPineapple");
        }

        @Override
        public Pizza build() {
            return pizza;
        }
    }

    static class DominosPizzaBuilder implements PizzaBuilder {
        private Pizza pizza;

        public DominosPizzaBuilder() {
            this.pizza = new Pizza("Dominos"); // Create a Pizza Hut pizza
        }

        @Override
        public void setSize(String size) {
            pizza.setSize(size);
        }

        @Override
        public void addPepperoni() {
            pizza.addTopping("Pepperoni");
        }

        @Override
        public void addSausage() {
            pizza.addTopping("Sausage");
        }

        @Override
        public void addMushrooms() {
            pizza.addTopping("Mushrooms");
        }

        @Override
        public void addBacon() {
            pizza.addTopping("Bacon");
        }

        @Override
        public void addOnions() {
            pizza.addTopping("Onions");
        }

        @Override
        public void addExtraCheese() {
            pizza.addTopping("ExtraCheese");
        }

        @Override
        public void addPeppers() {
            pizza.addTopping("Peppers");
        }

        @Override
        public void addChicken() {
            pizza.addTopping("Chicken");
        }

        @Override
        public void addOlives() {
            pizza.addTopping("Olives");
        }

        @Override
        public void addSpinach() {
            pizza.addTopping("Spinach");
        }

        @Override
        public void addTomatoAndBasil() {
            pizza.addTopping("TomatoAndBasil");
        }

        @Override
        public void addBeef() {
            pizza.addTopping("Beef");
        }

        @Override
        public void addHam() {
            pizza.addTopping("Ham");
        }

        @Override
        public void addPesto() {
            pizza.addTopping("Pesto");
        }

        @Override
        public void addSpicyPork() {
            pizza.addTopping("SpicyPork");
        }

        @Override
        public void addHamAndPineapple() {
            pizza.addTopping("HamAndPineapple");
        }

        @Override
        public Pizza build() {
            return pizza;
        }
    }

}
