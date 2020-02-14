package strategy.strategy;

import strategy.strategy.behavior.*;

/**
 * Created by Kevin on 2020/2/13.
 *
 * @author Kevin
 */
public class ToyDuck extends Duck {
    public ToyDuck() {
        super(new CannotFly(), new CannotQuark(), new CannotSwim(),"玩具鸭");
    }
}
