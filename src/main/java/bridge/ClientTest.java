package bridge;

import bridge.brand.HuaWei;
import bridge.brand.XiaoMi;
import bridge.phone.AbstractPhone;
import bridge.phone.FoldedPhone;
import bridge.phone.UpRightPhone;
import org.junit.Test;

/**
 * Created by Kevin on 2020/2/8.
 *
 * @author Kevin
 */
public class ClientTest {
    @Test
    public void test1(){
        AbstractPhone phone =  new UpRightPhone(new HuaWei());
        phone.open();
        phone.call();
    }

    @Test
    public void test2(){
        AbstractPhone phone =  new FoldedPhone(new XiaoMi());
        phone.open();
        phone.call();
    }
}
