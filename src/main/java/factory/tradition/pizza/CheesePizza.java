package factory.tradition.pizza;

/**
 * Created by Kevin on 2020/2/5.
 *
 * @author Kevin
 */
public class CheesePizza extends AbstractPizza {

    public CheesePizza() {
        super("奶酪披萨");
    }

    @Override
    public void prepare() {
        System.out.println(String.format("为%s进行准备，准备了奶酪", super.getName()));
    }
}
