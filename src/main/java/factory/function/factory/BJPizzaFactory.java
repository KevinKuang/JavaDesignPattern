package factory.function.factory;

import factory.function.pizza.AbstractPizza;
import factory.function.pizza.BJCheesePizza;
import factory.function.pizza.BJPepperPizza;

/**
 * Created by Kevin on 2020/2/6.
 *
 * @author Kevin
 */
public class BJPizzaFactory extends AbstractPizzaFactory {
    @Override
    public AbstractPizza createPizza(String type) {
        AbstractPizza pizza;
        if ("cheese".equalsIgnoreCase(type)){
            pizza = new BJCheesePizza();
        }else if ("pepper".equalsIgnoreCase(type)){
            pizza = new BJPepperPizza();
        }else {
            pizza = null;
        }
        return pizza;
    }
}
