package decorator.notuseoo;

import decorator.tea.BlackTea;
import decorator.tea.WuLong;
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
        MilkTea milkTea = new MilkTea(new WuLong());
        milkTea.append(Ingredient.YeGuo)
                .append(Ingredient.ZhenZhu)
                .append(Ingredient.YeGuo);
        Assert.assertEquals(10.4,milkTea.cost(),0.005);
    }
}
