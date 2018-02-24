package de.designpatterns.section1;

import de.designpatterns.section1.behaviours.FlyRocketPowered;
import de.designpatterns.section1.ducks.Duck;
import de.designpatterns.section1.ducks.MallardDuck;
import de.designpatterns.section1.ducks.ModelDuck;

public class MiniDucksSimulator {

    public static void run(){
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();
    }
}
