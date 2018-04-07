package de.designpatterns.section4_factory.pizza.store;

import de.designpatterns.section4_factory.pizza.ingredient.factory.ChicagoPizzaIngredientFactory;
import de.designpatterns.section4_factory.pizza.ingredient.factory.PizzaIngredientFactory;
import de.designpatterns.section4_factory.pizza.pizza.*;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        switch (item) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
                break;
            case "veggie":
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("Chicago Style Veggie Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Chicago Style Veggie Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("Chicago Style Veggie Pizza");
                break;
        }
        return pizza;
    }
}
