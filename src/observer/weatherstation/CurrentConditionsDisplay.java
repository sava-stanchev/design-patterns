package observer.weatherstation;

public class CurrentConditionsDisplay {
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Current conditions:");
        System.out.println("Temperature: " + temperature);
        System.out.println("Humidity: " + humidity);
        System.out.println("Pressure: " + pressure);
    }
}