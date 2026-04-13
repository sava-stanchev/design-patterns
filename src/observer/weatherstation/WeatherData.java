package observer.weatherstation;

public class WeatherData {
    private float temperature;
    private float humidity;
    private float pressure;

    public void measurementsChanged() {
        System.out.println("Measurements changed!");
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }
}