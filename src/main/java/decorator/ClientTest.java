package decorator;

import decorator.tea.MilkTea;
import decorator.tea.WuLong;
import decorator.tea.YeGuo;
import decorator.tea.ZhenZhu;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Kevin on 2020/2/8.
 *
 * @author Kevin
 */
public class ClientTest {

    @Test
    public void test(){
        // 1份珍珠1.5，2份椰果2.4，乌龙茶6.5
        MilkTea milkTea = new WuLong();
        milkTea = new YeGuo(milkTea);
        milkTea = new ZhenZhu(milkTea);
        milkTea = new YeGuo(milkTea);
        Assert.assertEquals(10.4,milkTea.cost(),0.005);
    }
}
