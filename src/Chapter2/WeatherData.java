package Chapter2;

import java.util.*;

public class WeatherData implements Subject {
    private List<Observer> observers; // 객체들을 저장하는 ArrayList
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>(); // 객체 생성
    }

    public void registerObserver(Observer o) { // 옵저버가 등록을 요청할시 추가
        observers.add(o);
    }

    public void removeObserver(Observer o) { // 옵저버가 탈퇴를 요청할시 추가
        observers.remove(o);
    }

    public void notifyObservers() { // 모든 옵저버에게 상태 변화를 알림
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void measurementsChanged() { // 갱신된 측정값을 받고 옵저버에게 알림
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

}