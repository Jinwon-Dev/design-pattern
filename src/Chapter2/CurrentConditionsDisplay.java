package Chapter2;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) { // 디스플레이를 옵저버로 등록
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update() {
        this.temperature = weatherData.getTemperature(); // 온도와 습도를 저장하고 display()를 호출
        this.humidity = weatherData.getHumidity();
        display();
    }

    public void display() { // 가상 최근에 받은 온도와 습도를 출력
        System.out.println("현재 상태: 온도 " + temperature
                + "F, 습도 " + humidity + "%");
    }
}
