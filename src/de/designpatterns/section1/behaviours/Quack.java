package de.designpatterns.section1.behaviours;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quaaaack");
    }
}
