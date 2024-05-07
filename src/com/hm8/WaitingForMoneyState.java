package com.hm8;

public class WaitingForMoneyState implements StateOfVendingMachine{
    private VendingMachine vendingMachine;

    public WaitingForMoneyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }


    @Override
    public void selectSnack(String snackName, int quantity) {
        System.out.printf("You can't select another snack until you pay for your current snack.\n");
    }

    @Override
    public void insertCoin(double userPaidAmount) {
        double snackPrice = vendingMachine.getSelectedSnack().getSnackPrice();
        double userSnackQuantity = vendingMachine.getSelectedSnackQuantity();
        double actualSnackQuantity = vendingMachine.getSelectedSnack().getSnackQuantity();
        double totalCost = snackPrice * userSnackQuantity;
        System.out.printf("You inserted: $%.2f\n", userPaidAmount);
        if (userPaidAmount < totalCost){
            System.out.println("Not enough money inserted. Money ejected");
            vendingMachine.setState(new IdleState(vendingMachine));
            return;
        } else if(actualSnackQuantity < userSnackQuantity) {
            System.out.printf("Not enough %s in the machine. Money ejected\n", vendingMachine.getSelectedSnack().getSnackName());
            vendingMachine.setState(new IdleState(vendingMachine));
            return;
        } else if(userPaidAmount > totalCost){
            double returnAmount = userPaidAmount - totalCost;
            System.out.printf("Your change: $%.2f is returned.\n", returnAmount);
        }
        vendingMachine.setState(new DispensingState(vendingMachine));
    }

    @Override
    public void dispenseSnack() {
        System.out.println("You need to pay first");
    }
}
