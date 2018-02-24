package de.designpatterns.section2.observer;

import de.designpatterns.section2.subject.Subject;

import java.util.ArrayList;
import java.util.Collections;

public class StatisticsDisplay implements Observer, DisplayElement {
    private ArrayList<Float> temperatures;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
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
    public void update(float temp, float humidity, float pressure) {
        temperatures.add(temp);
        display();
    }
}
