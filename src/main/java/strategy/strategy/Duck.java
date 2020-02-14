package strategy.strategy;

import strategy.strategy.behavior.FlyBehavior;
import strategy.strategy.behavior.QuarkBehavior;
import strategy.strategy.behavior.SwimBehavior;

/**
 * Created by Kevin on 2020/2/13.
 *
 * @author Kevin
 */
public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuarkBehavior quarkBehavior;
    private SwimBehavior swimBehavior;
    private String name;

    public Duck(FlyBehavior flyBehavior, QuarkBehavior quarkBehavior, SwimBehavior swimBehavior, String name) {
        this.flyBehavior = flyBehavior;
        this.quarkBehavior = quarkBehavior;
        this.swimBehavior = swimBehavior;
        this.name = name;
    }

    public void display(){
        System.out.println("这是"+this.name);
    }

    public void quark(){
        System.out.printf(this.name);
        quarkBehavior.quark();
    }

    public void swim(){
        System.out.printf(this.name);
        swimBehavior.swim();
    }

    public void fly(){
        System.out.printf(this.name);
        flyBehavior.fly();
    }
}
