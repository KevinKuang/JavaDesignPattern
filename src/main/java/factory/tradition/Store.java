package factory.tradition;

import factory.tradition.order.Order;

/**
 * Created by Kevin on 2020/2/5.
 * 传统模式
 * @author Kevin
 */
public class Store {
    public static void main(String[] args) {
        Order order = new Order();
        order.run();
    }
}
