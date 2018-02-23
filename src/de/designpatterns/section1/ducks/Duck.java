package de.designpatterns.section1.ducks;

import de.designpatterns.section1.behaviours.FlyBehaviour;
import de.designpatterns.section1.behaviours.QuackBehaviour;

public abstract class Duck {
    public FlyBehaviour flyBehaviour;
    public QuackBehaviour quackBehaviour;

    public Duck(){

    }

    public void swim(){
        System.out.println("I am swimming");
    }

    public abstract void display();

    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }
}
