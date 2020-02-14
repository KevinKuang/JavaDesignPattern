package strategy.strategy.behavior;


/**
 * Created by Kevin on 2020/2/13.
 *
 * @author Kevin
 */
public class CanFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("会飞翔");
    }
}
