package de.designpatterns.section1.behaviours;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println(".........");
    }
}
