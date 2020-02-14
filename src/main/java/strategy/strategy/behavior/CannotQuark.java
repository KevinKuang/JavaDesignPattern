package strategy.strategy.behavior;

/**
 * Created by Kevin on 2020/2/13.
 *
 * @author Kevin
 */
public class CannotQuark implements QuarkBehavior {
    @Override
    public void quark() {
        System.out.println("不能叫");
    }
}
