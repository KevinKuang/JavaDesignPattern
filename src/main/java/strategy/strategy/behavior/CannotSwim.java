package strategy.strategy.behavior;

import strategy.strategy.behavior.SwimBehavior;

/**
 * Created by Kevin on 2020/2/13.
 *
 * @author Kevin
 */
public class CannotSwim implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("不会游泳");
    }
}
