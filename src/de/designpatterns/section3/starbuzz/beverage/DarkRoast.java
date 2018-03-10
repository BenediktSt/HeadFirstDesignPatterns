package de.designpatterns.section3.starbuzz.beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dask Roasted Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
