package factory.function;


import factory.function.factory.BJPizzaFactory;
import factory.function.order.Order;

/**
 * Created by Kevin on 2020/2/6.
 *
 * @author Kevin
 */
public class Store {
    public static void main(String[] args) {
        Order bjOrder = new Order(new BJPizzaFactory());
        bjOrder.run();
    }
}
