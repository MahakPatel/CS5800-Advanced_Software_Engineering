interface StateOfVendingMachine {
    public void selectSnack(String snackName, int quantity);
    public void insertCoin(double userPaidAmount);
    public void dispenseSnack();
}
