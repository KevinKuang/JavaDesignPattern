package strategy.strategy.behavior;

import strategy.strategy.behavior.FlyBehavior;

/**
 * Created by Kevin on 2020/2/13.
 *
 * @author Kevin
 */
public class CannotFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞翔");
    }
}
