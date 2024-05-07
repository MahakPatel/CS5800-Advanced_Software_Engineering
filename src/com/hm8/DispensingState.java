public class DispensingState implements StateOfVendingMachine{

    private VendingMachine vendingMachine;
    private SnackDispenseHandler snackDispenseHandler;

    public DispensingState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
        snackDispenseHandler = new CokeDispenseHandler(
                new PepsiDispenseHandler(new CheetosDispenseHandler(
                new DoritosDispenseHandler(new KitKatDispenseHandler(new SnickersDispenseHandler(null))))));
    }

    @Override
    public void selectSnack(String snackName, int quantity) {
        System.out.println("You can't select another snack until you receive your snack.");
    }

    @Override
    public void insertCoin(double userPaidAmount) {
        System.out.println("You can't insert another coin until you receive your snack.");
    }

    @Override
    public void dispenseSnack() {
        snackDispenseHandler.dispenseSnack(vendingMachine.getSelectedSnack(), vendingMachine.getSelectedSnackQuantity());
        vendingMachine.setState(new IdleState(vendingMachine));
    }

}
