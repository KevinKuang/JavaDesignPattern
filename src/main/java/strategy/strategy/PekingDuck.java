package strategy.strategy;

import strategy.strategy.behavior.*;

/**
 * Created by Kevin on 2020/2/13.
 *
 * @author Kevin
 */
public class PekingDuck extends Duck {
    public PekingDuck() {
        super(new CannotFly(), new GagaQuark(), new CanSwim(),"北京鸭");
    }
}
