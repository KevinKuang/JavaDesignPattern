package factory.tradition.pizza;

/**
 * Created by Kevin on 2020/2/5.
 *
 * @author Kevin
 */
public class GreekPizza extends AbstractPizza {
    public GreekPizza() {
        super("希腊披萨");
    }

    @Override
    public void prepare() {
        System.out.println(String.format("为%s进行准备，准备了花生", super.getName()));
    }
}
