package bridge.brand;

/**
 * Created by Kevin on 2020/2/8.
 *
 * @author Kevin
 */
public class HuaWei implements Brand {
    @Override
    public void open() {
        System.out.println("华为手机开机");
    }

    @Override
    public void call() {
        System.out.println("华为手机通话");
    }
}
