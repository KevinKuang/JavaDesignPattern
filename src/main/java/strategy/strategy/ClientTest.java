package strategy.strategy;

import org.junit.Test;

/**
 * Created by Kevin on 2020/2/13.
 *
 * @author Kevin
 */
public class ClientTest {

    @Test
    public void test(){
        Duck duck = new PekingDuck();
        duck.fly();
        duck.quark();
        duck.swim();
    }
}
