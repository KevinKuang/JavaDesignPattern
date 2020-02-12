package factory.tradition.order;

import factory.tradition.pizza.AbstractPizza;
import factory.tradition.pizza.CheesePizza;
import factory.tradition.pizza.GreekPizza;
import factory.tradition.pizza.PepperPizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Kevin on 2020/2/5.
 *
 * @author Kevin
 */
public class Order {
    public void run(){
        do {
            AbstractPizza pizza;
            String type = getType();
            if ("cheese".equalsIgnoreCase(type)){
                pizza = new CheesePizza();
            }else if ("greek".equalsIgnoreCase(type)) {
                pizza = new GreekPizza();
                // 需要在这里新增代码
            }else if ("pepper".equalsIgnoreCase(type)){
                pizza = new PepperPizza();
            }else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
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
