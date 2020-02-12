package factory.function.pizza;

/**
 * Created by Kevin on 2020/2/6.
 *
 * @author Kevin
 */
public class SHCheesePizza extends AbstractPizza {

    public SHCheesePizza() {
        super("上海的奶酪披萨");
    }

    @Override
    public void prepare() {
        System.out.println(String.format("为%s进行准备，准备了上海的奶酪", super.getName()));
    }
}
