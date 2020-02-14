package strategy.strategy;

import strategy.strategy.behavior.CanFly;
import strategy.strategy.behavior.CanSwim;
import strategy.strategy.behavior.GagaQuark;

/**
 * Created by Kevin on 2020/2/13.
 *
 * @author Kevin
 */
public class WildDuck extends Duck {
    public WildDuck() {
        super(new CanFly(), new GagaQuark(), new CanSwim(),"野鸭");
    }
}
