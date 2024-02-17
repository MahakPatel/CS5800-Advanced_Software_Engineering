package com.hm1.polymorphism;

public class DriverForPolymorphism {
    public static void run() {
        Ship[] ships = new Ship[3];

        ships[0] = new Ship("Ship1", "2000");
        ships[1] = new CruiseShip("CruiseShip1", "2010", 2000);
        ships[2] = new CargoShip("CargoShip1", "2020", 5000);

        for (Ship ship : ships) {
            ship.print();
            System.out.println();
        }
    }
}
