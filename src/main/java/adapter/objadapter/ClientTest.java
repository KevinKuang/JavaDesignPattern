package adapter.objadapter;

import adapter.OutputDataClass;
import adapter.UseDataClass;
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
        OutputDataClass outputDataClass = new OutputDataClass();
        ObjectAdapter adapter = new ObjectAdapter(outputDataClass);
        String[] array = UseDataClass.use(adapter);
        Assert.assertEquals("1",array[0]);
    }
}
