package adapter.classadapter;

import adapter.UseDataClass;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Kevin on 2020/2/7.
 *
 * @author Kevin
 */
public class ClientTest {
    @Test
    public void test(){
        ClassAdapter adapter = new ClassAdapter();
        String[] array = UseDataClass.use(adapter);
        Assert.assertEquals("1",array[0]);
    }
}
