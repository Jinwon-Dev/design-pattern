package Chapter2;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(); // WeatherData 객체를 생성

        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData); // 3개의 디스플레이를 생성하고, 객체를 인자로 전달

        weatherData.setMeasurements(80, 65, 30.4f); // 새로운 기상 측정값이 들어왔다고 가정
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
