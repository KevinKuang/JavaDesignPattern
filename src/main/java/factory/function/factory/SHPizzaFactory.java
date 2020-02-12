package factory.function.factory;

import factory.function.pizza.AbstractPizza;
import factory.function.pizza.SHCheesePizza;
import factory.function.pizza.SHPepperPizza;

/**
 * Created by Kevin on 2020/2/6.
 *
 * @author Kevin
 */
public class SHPizzaFactory extends AbstractPizzaFactory {
    @Override
    public AbstractPizza createPizza(String type) {
        AbstractPizza pizza;
        if ("cheese".equalsIgnoreCase(type)){
            pizza = new SHCheesePizza();
        }else if ("pepper".equalsIgnoreCase(type)){
            pizza = new SHPepperPizza();
        }else {
            pizza = null;
        }
        return pizza;
    }
}
