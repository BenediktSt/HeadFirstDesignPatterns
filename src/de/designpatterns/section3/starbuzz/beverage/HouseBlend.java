package de.designpatterns.section3.starbuzz.beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "Houhse Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
