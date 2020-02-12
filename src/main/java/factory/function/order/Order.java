package factory.function.order;

import factory.function.factory.AbstractPizzaFactory;
import factory.function.factory.BJPizzaFactory;
import factory.function.order.tool.InputTypeTool;
import factory.function.pizza.AbstractPizza;

/**
 * Created by Kevin on 2020/2/6.
 *
 * @author Kevin
 */
public class Order {
    AbstractPizzaFactory factory;

    public Order(AbstractPizzaFactory factory) {
        this.factory = factory;
    }
    public void run(){
        do {
            AbstractPizza pizza = this.factory.createPizza(InputTypeTool.getType());
            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                break;
            }
        }while (true);
    }
}
