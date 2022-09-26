package Chapter12.combining;

public class DuckCall implements Quackable {
    Observable observable = new Observable(this);

    public void quack() {
        System.out.println("꽉꽉");
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }
}
