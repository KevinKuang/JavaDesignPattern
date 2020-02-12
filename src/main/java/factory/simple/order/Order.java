package factory.simple.order;

import factory.simple.factory.SimplePizzaFactory;
import factory.simple.pizza.AbstractPizza;
import factory.simple.pizza.CheesePizza;
import factory.simple.pizza.GreekPizza;
import factory.simple.pizza.PepperPizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Kevin on 2020/2/5.
 * 使用者
 * @author Kevin
 */
public class Order {
    private SimplePizzaFactory factory;

    public Order (SimplePizzaFactory factory){
        this.factory = factory;
    }

    public void run(){
        do {
            AbstractPizza pizza = this.factory.createPizza(getType());
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

    private String getType(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入披萨种类：");
        try {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
