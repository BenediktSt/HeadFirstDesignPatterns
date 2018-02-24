package de.designpatterns.section1.ducks;

import de.designpatterns.section1.behaviours.FlyNoWay;
import de.designpatterns.section1.behaviours.Quack;

public class ModelDuck extends Duck {
    @Override
    public void display() {
        System.out.println("i'm a model duck");
    }

    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }
}
