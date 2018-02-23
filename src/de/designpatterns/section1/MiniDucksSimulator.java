package de.designpatterns.section1;

import de.designpatterns.section1.ducks.Duck;
import de.designpatterns.section1.ducks.MallardDuck;

public class MiniDucksSimulator {

    public static void run(){
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }
}
