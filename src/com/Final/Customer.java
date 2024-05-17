package Final;

public class Customer implements Observer {
    private String name;
    private String address;
    private String county;
    private String dietaryRestriction;
    private String statusUpdate;

    public Customer(String name, String address, String county, String dietaryRestriction) {
        this.name = name;
        this.address = address;
        this.county = county;
        this.dietaryRestriction = dietaryRestriction;
    }

    public String getName() {
        return name;
    }

    public String getCounty() {
        return county;
    }

    public String getDietaryRestriction() {
        return dietaryRestriction;
    }

    @Override
    public void update(String message) {
        this.statusUpdate = message;
        System.out.println("Notification for " + name + ": " + message);
    }
}
