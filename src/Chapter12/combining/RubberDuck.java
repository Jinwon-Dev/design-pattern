package Chapter12.combining;

public class RubberDuck implements Quackable {
    Observable observable = new Observable(this);

    public void quack() {
        System.out.println("삑삑");
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }
}
