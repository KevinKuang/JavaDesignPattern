package bridge.phone;

import bridge.brand.Brand;

/**
 * Created by Kevin on 2020/2/8.
 *
 * @author Kevin
 */
public abstract class AbstractPhone {
    private Brand brand;

    public AbstractPhone(Brand brand) {
        this.brand = brand;
    }

    public void open(){
        brand.open();
    }

    public void call(){
        brand.call();
    }
}
