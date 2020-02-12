package factory.tradition.pizza;

/**
 * Created by Kevin on 2020/2/5.
 *
 * @author Kevin
 */
public class PepperPizza extends AbstractPizza {
    public PepperPizza(){
        super("胡椒");
    }
    @Override
    public void prepare() {
        System.out.println(String.format("为%s进行准备，准备了胡椒", super.getName()));
    }
}
