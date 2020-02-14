package strategy.tradition;

/**
 * Created by Kevin on 2020/2/13.
 *
 * @author Kevin
 */
public abstract class Duck {

    public abstract void display();

    public void quark(){
        System.out.println("鸭子嘎嘎叫");
    }

    public void swim(){
        System.out.println("鸭子会游泳");
    }

    public void fly(){
        System.out.println("鸭子会飞");
    }
}
