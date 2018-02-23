package de.designpatterns.section1.behaviours;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeeeeeeak");
    }
}
