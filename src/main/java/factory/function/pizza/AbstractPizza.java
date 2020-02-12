package factory.function.pizza;

/**
 * Created by Kevin on 2020/2/5.
 *
 * @author Kevin
 */
public abstract class AbstractPizza {
    private String name;

    public AbstractPizza(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * 准备工作各不相同
     */
    public abstract void prepare();

    public void bake() {
        System.out.println(String.format("为%s进行烘焙", this.name));
    }

    public void cut() {
        System.out.println(String.format("为%s进行剪切", this.name));
    }

    public void box() {
        System.out.println(String.format("为%s进行装盒", this.name));
    }
}
