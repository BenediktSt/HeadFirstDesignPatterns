package de.designpatterns.section4_factory.pizza.store;

import de.designpatterns.section4_factory.pizza.ingredient.factory.NYPizzaIngredientFactory;
import de.designpatterns.section4_factory.pizza.ingredient.factory.PizzaIngredientFactory;
import de.designpatterns.section4_factory.pizza.pizza.*;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        switch (item) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
                break;
            case "veggie":
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("New York Style Veggie Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York Style Veggie Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("New York Style Veggie Pizza");
                break;
        }
        return pizza;
    }
}
