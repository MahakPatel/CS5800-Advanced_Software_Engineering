package com.hm8;

public class IdleState implements StateOfVendingMachine {

    private VendingMachine vendingMachine;

    public IdleState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public void showSnackOrderedInfo(String snackName, int quantity){
        System.out.printf("%d %s is selected - ", quantity, snackName);
        System.out.printf("%s price: $%.2f/each\n", snackName, vendingMachine.getSnacks().get(snackName).getSnackPrice());
    }

    public boolean hasSnackAvailable() {
        if (vendingMachine.getSelectedSnack().getSnackQuantity() > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void selectSnack(String snackName, int quantity) {
        showSnackOrderedInfo(snackName, quantity);
        vendingMachine.setState(new WaitingForMoneyState(vendingMachine));
    }

    @Override
    public void insertCoin(double userPaidAmount) {
        System.out.printf("You haven't selected a snack yet. Please select a snack first.\n");
    }

    @Override
    public void dispenseSnack() {
        System.out.println("You haven't selected a snack yet. Please select a snack first.");
    }
}
