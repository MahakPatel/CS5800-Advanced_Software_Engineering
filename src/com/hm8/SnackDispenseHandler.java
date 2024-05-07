public abstract class SnackDispenseHandler {
    private SnackDispenseHandler next;

    public SnackDispenseHandler(SnackDispenseHandler next){
        this.next = next;
    }

    public void dispenseSnack(Snack snack, int quantity){
        if(next != null){
            next.dispenseSnack(snack, quantity);
        } else if(next == null || snack.getSnackQuantity() < quantity){
            System.out.printf("Snack %s is not available\n", snack.getSnackName());
        }
    }

}
