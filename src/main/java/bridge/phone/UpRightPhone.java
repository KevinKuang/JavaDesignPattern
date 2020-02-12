package bridge.phone;

import bridge.brand.Brand;

/**
 * Created by Kevin on 2020/2/8.
 *
 * @author Kevin
 */
public class UpRightPhone extends AbstractPhone {
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        System.out.print("直立式");
        super.open();
    }

    @Override
    public void call() {
        System.out.print("直立式");
        super.call();
    }
}
