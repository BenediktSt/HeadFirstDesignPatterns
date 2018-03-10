package de.designpatterns.section3.starbuzz.condiment;

import de.designpatterns.section3.starbuzz.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
