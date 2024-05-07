package com.hm8;

public class Snack {
    private String snackName;
    private double snackPrice;
    private int snackQuantity;

    public Snack(String snackName, double snackPrice, int snackQuantity) {
        this.snackName = snackName;
        this.snackPrice = snackPrice;
        this.snackQuantity = snackQuantity;
    }

    public int getSnackQuantity() {
        return snackQuantity;
    }

    public double getSnackPrice() {
        return snackPrice;
    }

    public String getSnackName() {
        return snackName;
    }

    public void setSnackQuantity(int snackQuantity) {
        this.snackQuantity = snackQuantity;
    }

    public int getQuantity() {
        return snackQuantity;
    }
}
