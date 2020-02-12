package bridge.brand;

/**
 * Created by Kevin on 2020/2/8.
 *
 * @author Kevin
 */
public class XiaoMi implements Brand {
    @Override
    public void open() {
        System.out.println("小米手机开机");
    }

    @Override
    public void call() {
        System.out.println("小米手机通话");
    }
}
