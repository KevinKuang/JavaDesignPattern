package factory.function.factory;

import factory.function.pizza.AbstractPizza;

/**
 * Created by Kevin on 2020/2/6.
 *
 * @author Kevin
 */
public abstract class AbstractPizzaFactory {
    public abstract AbstractPizza createPizza(String type);
}
