package strategy.strategy.behavior;

import strategy.strategy.behavior.SwimBehavior;

/**
 * Created by Kevin on 2020/2/13.
 *
 * @author Kevin
 */
public class CanSwim implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("会游泳");
    }
}
