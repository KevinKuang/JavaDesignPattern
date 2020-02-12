package factory.simple.factory;

import factory.simple.pizza.AbstractPizza;
import factory.simple.pizza.CheesePizza;
import factory.simple.pizza.GreekPizza;
import factory.simple.pizza.PepperPizza;

/**
 * Created by Kevin on 2020/2/5.
 *
 * @author Kevin
 */
public class SimplePizzaFactory {
    public AbstractPizza createPizza(String type){
        AbstractPizza pizza;
        if ("cheese".equalsIgnoreCase(type)){
            pizza = new CheesePizza();
        }else if ("greek".equalsIgnoreCase(type)) {
            pizza = new GreekPizza();
            // 需要在这里新增代码
        }else if ("pepper".equalsIgnoreCase(type)){
            pizza = new PepperPizza();
        }else {
            pizza = null;
        }
        return pizza;
    }
}
