package factory.simple;

import factory.simple.factory.SimplePizzaFactory;
import factory.simple.order.Order;

/**
 * Created by Kevin on 2020/2/5.
 * 简单工厂模式
 * @author Kevin
 */
public class Store {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        Order order = new Order(factory);
        order.run();
    }
}
