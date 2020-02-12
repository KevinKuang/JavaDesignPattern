package factory.function.pizza;

/**
 * Created by Kevin on 2020/2/6.
 *
 * @author Kevin
 */
public class BJCheesePizza extends AbstractPizza {
    public BJCheesePizza() {
        super("北京的奶酪披萨");
    }

    @Override
    public void prepare() {
        System.out.println(String.format("为%s进行准备，准备了北京的奶酪", super.getName()));
    }
}
