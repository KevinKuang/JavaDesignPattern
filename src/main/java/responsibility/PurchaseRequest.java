package responsibility;

import java.util.Random;

/**
 * Created by Kevin on 2020/2/14.
 *
 * @author Kevin
 */
public class PurchaseRequest {

    private int id;
    private float price;
    private int type;


    public PurchaseRequest(float price, int type) {
        this.price = price;
        this.type = type;
        this.id = new Random().nextInt();
    }

    public float getPrice() {
        return price;
    }

    public int getType() {
        return type;
    }

    public int getId() {

        return id;
    }
}
