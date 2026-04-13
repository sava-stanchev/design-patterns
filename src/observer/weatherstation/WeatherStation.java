package observer.weatherstation;

public class WeatherStation {
    public static void main(String[] args) {
        CurrentConditionsDisplay display = new CurrentConditionsDisplay();

        WeatherData weatherData = new WeatherData(display);

        weatherData.setMeasurements(80, 65, 30.4f);
    }
}