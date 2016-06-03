package Lesson28.factory.patterns.factory.pizza;

import Lesson28.factory.patterns.factory.factory.PizzaComponentsFactory;

/**
 * Created by User on 03.06.2016.
 */
public class ChicagoCheesePizza extends Pizza {

    public ChicagoCheesePizza(PizzaComponentsFactory pizzaComponentsFactory) {

        dough = pizzaComponentsFactory.createDough();

        cheese = pizzaComponentsFactory.createCheese();
    }

    @Override
    public void box(){
        System.out.println("Boxing in Chicago box");
    }
}
