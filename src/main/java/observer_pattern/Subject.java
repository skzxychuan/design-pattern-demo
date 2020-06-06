package observer_pattern;

public interface Subject {
    void registerObserver(MyObserver observer);
    void removeObserver(MyObserver observer);
    void notifyObservers();
}
