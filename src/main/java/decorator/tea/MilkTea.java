package decorator.tea;

/**
 * Created by Kevin on 2020/2/8.
 *
 * @author Kevin
 */
public abstract class MilkTea {
    private float price = 0.0f;

    public float getPrice() {
        return price;
    }

    protected void setPrice(float price){
        this.price = price;
    }

    public abstract float cost();
}
