import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Driver {
    public static <Hash> void main(String[] args) {
        Map<String, Snack> snacks = createSnacks();
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.setSnacks(snacks);

        vendingMachine.selectSnack("Coke", 2);
        vendingMachine.insertCoin(10);
        vendingMachine.dispenseSnack();

        System.out.println();
        vendingMachine.selectSnack("Doritos", 1);
        vendingMachine.insertCoin(2.5);
        vendingMachine.dispenseSnack();

        System.out.println();
        vendingMachine.selectSnack("Snickers", 3);
        vendingMachine.insertCoin(10);

        System.out.println();
        vendingMachine.selectSnack("Snickers", 2);
        vendingMachine.insertCoin(2.5);
        vendingMachine.dispenseSnack();

        System.out.println();
        vendingMachine.selectSnack("Snickers", 1);
        vendingMachine.insertCoin(1.15);
    }

    public static Map<String, Snack> createSnacks(){
        Map<String, Snack> snacks = new HashMap<String, Snack>();
        snacks.put("Coke", new Snack("Coke", 1.00, 2));
        snacks.put("Pepsi", new Snack("Pepsi", 0.99, 3));
        snacks.put("Cheetos", new Snack("Cheetos", 2.25, 3));
        snacks.put("Doritos", new Snack("Doritos", 2.50, 3));
        snacks.put("KitKat", new Snack("KitKat", 1.25, 2));
        snacks.put("Snickers", new Snack("Snickers", 1.15, 2));


        return snacks;
    }
}
