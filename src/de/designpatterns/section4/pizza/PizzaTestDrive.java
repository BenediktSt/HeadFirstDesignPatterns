package de.designpatterns.section4.pizza;

import de.designpatterns.section4.pizza.pizza.Pizza;
import de.designpatterns.section4.pizza.store.ChicagoPizzaStore;
import de.designpatterns.section4.pizza.store.NYPizzaStore;
import de.designpatterns.section4.pizza.store.PizzaStore;

public class PizzaTestDrive {

    public static void main (String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + " \n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + " \n");
    }
}
