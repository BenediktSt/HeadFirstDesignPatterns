package de.designpatterns.section2.observer;

import de.designpatterns.section2.subject.WeatherData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    private ArrayList<Float> temperatures;
    private Observable observable;

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
        temperatures = new ArrayList<>();
    }

    @Override
    public void display() {
        float max = Collections.max(temperatures);
        float min = Collections.min(temperatures);
        double avg = temperatures.stream().mapToDouble(x -> x).average().getAsDouble();

        System.out.println("Avg/Min/Max temperature = " + avg + "/" + max + "/" + min);
    }

    @Override
    public void update(Observable obs, Object args) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            temperatures.add(weatherData.getTemperature());
            display();
        }
    }
}
