import java.util.ArrayList;
import java.util.List;

public class MetricPublisher {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(int value) {
        for (Observer observer : observers) {
            observer.update(value);
        }
    }
}
