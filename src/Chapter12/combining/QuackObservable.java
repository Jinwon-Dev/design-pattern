package Chapter12.combining;

public interface QuackObservable {
    public void registerObserver(Observer observer);

    public void notifyObservers();
}
