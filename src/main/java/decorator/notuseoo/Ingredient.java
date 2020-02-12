package decorator.notuseoo;

/**
 * Created by Kevin on 2020/2/8.
 *
 * @author Kevin
 */
public enum Ingredient {
    YeGuo(1.2F),
    ZhenZhu(1.5F),
    ;
    private float price;

    Ingredient(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
}
