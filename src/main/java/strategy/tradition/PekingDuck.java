package strategy.tradition;

/**
 * Created by Kevin on 2020/2/13.
 *
 * @author Kevin
 */
public class PekingDuck extends Duck {
    @Override
    public void display() {
        System.out.println("这是北京鸭");
    }

    // 北京鸭不会飞

    @Override
    public void fly() {
        System.out.println("北京鸭不会飞");
    }
}
