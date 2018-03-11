package de.designpatterns.section4.pizza.store;

import de.designpatterns.section4.pizza.pizza.NYStyleCheesePizza;
import de.designpatterns.section4.pizza.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else return null;
    }
}
