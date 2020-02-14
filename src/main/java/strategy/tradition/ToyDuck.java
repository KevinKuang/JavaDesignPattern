package strategy.tradition;

/**
 * Created by Kevin on 2020/2/13.
 *
 * @author Kevin
 */
public class ToyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("这是玩具鸭");
    }

    @Override
    public void quark() {
        System.out.println("玩具鸭不能叫");
    }

    @Override
    public void swim() {
        System.out.println("玩具鸭不能游泳");
    }

    @Override
    public void fly() {
        System.out.println("玩具鸭不会飞");
    }
}
