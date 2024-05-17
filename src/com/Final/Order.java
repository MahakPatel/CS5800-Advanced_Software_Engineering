package Final;

import java.util.ArrayList;
import java.util.List;

public class Order implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String status;

    public Order() {
        this.status = "Order Placed";
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(status);
        }
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    public String getStatus() {
        return status;
    }
}

