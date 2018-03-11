package de.designpatterns.section4.pizza.store;

import de.designpatterns.section4.pizza.pizza.ChicagoStyleCheesePizza;
import de.designpatterns.section4.pizza.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else return null;
    }
}
