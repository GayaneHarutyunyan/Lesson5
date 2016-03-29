package Lesson14.observer;

/**
 * Created by User on 29.03.2016.
 */
public class CurrentDisplay {
    private int temperature;
    private int humidity;
    private int pressute;

    public void display() {
        System.out.println("temperature: " + temperature + ", humidity: " + humidity + ", pressure" + pressute);
    }

    public void update(int temperature, int humidity, int pressute) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressute = pressute;

    }
}
