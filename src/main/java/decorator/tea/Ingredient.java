package decorator.tea;

/**
 * Created by Kevin on 2020/2/8.
 *
 * @author Kevin
 */
public abstract class Ingredient extends MilkTea {
    private MilkTea milkTea;


    public Ingredient(MilkTea milkTea) {
        this.milkTea = milkTea;
    }

    @Override
    public float cost() {
        return milkTea.cost() + super.getPrice();
    }
}
