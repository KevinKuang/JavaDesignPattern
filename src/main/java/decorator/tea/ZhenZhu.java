package decorator.tea;

/**
 * Created by Kevin on 2020/2/8.
 *
 * @author Kevin
 */
public class ZhenZhu extends Ingredient {
    public ZhenZhu(MilkTea milkTea) {
        super(milkTea);
        super.setPrice(1.5F);
    }
}
