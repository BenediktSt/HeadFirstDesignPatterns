package de.designpatterns.section2;

import de.designpatterns.section2.observer.CurrentConditionDisplay;
import de.designpatterns.section2.observer.ForecastDisplay;
import de.designpatterns.section2.observer.HeatIndexDisplay;
import de.designpatterns.section2.observer.StatisticsDisplay;
import de.designpatterns.section2.subject.WeatherData;

public class WeatherStation {

    public static void run(){
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println();
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println();
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
