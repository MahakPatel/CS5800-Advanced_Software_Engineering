import java.util.HashMap;
import java.util.Map;

public class VendingMachine {

    private StateOfVendingMachine state;
    private Map<String, Snack> snacks;
    private Snack userSelectedSnack;
    private int userSelectedSnackQuantity;

    public VendingMachine() {
        state = new IdleState(this);
        snacks = new HashMap<String, Snack>();
    }

    public void setSnacks(Map<String, Snack> snacks) {
        this.snacks = snacks;
    }

    public void setState(StateOfVendingMachine state) {
        this.state = state;
    }

    public void selectSnack(String snackName, int quantity){
        if (!snacks.containsKey(snackName)) {
            System.out.println("Snack not available in this vending machine.");
            return;
        }
        userSelectedSnack = snacks.get(snackName);
        userSelectedSnackQuantity = quantity;
        state.selectSnack(snackName, quantity);
    }

    public void insertCoin(double coinAmount) {
        state.insertCoin(coinAmount);
    }

    public void dispenseSnack() {
        state.dispenseSnack();
    }

    public Map<String,Snack> getSnacks() {
        return snacks;
    }

    public Snack getSelectedSnack() {
        return userSelectedSnack;
    }

    public int getSelectedSnackQuantity() {
        return userSelectedSnackQuantity;
    }

    public void showCurrentStateInfor(){
        System.out.printf("Current state: %s\n", state.getClass().getSimpleName());
    }

}
