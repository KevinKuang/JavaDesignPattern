package factory.function.pizza;

/**
 * Created by Kevin on 2020/2/6.
 *
 * @author Kevin
 */
public class SHPepperPizza extends AbstractPizza {

    public SHPepperPizza() {
        super("上海的胡椒披萨");
    }
    @Override
    public void prepare() {
        System.out.println(String.format("为%s进行准备，准备了上海的胡椒", super.getName()));
    }
}
