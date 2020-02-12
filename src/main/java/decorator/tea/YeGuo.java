package decorator.tea;

/**
 * Created by Kevin on 2020/2/8.
 *
 * @author Kevin
 */
public class YeGuo extends Ingredient {
    public YeGuo(MilkTea milkTea) {
        super(milkTea);
        super.setPrice(1.2F);
    }
}
