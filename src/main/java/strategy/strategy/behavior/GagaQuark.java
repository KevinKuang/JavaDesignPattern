package strategy.strategy.behavior;

import strategy.strategy.behavior.QuarkBehavior;

/**
 * Created by Kevin on 2020/2/13.
 *
 * @author Kevin
 */
public class GagaQuark implements QuarkBehavior {
    @Override
    public void quark() {
        System.out.println("嘎嘎叫");
    }
}
