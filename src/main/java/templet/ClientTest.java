package templet;

import org.junit.Test;

/**
 * Created by Kevin on 2020/2/10.
 *
 * @author Kevin
 */
public class ClientTest {

    @Test
    public void test(){
        SoyaMilk lemonSoyaMilk = new LemonSoyaMilk();
        lemonSoyaMilk.make();

        System.out.println("============");
        SoyaMilk blackSoyaMilk = new BlackSoyaMilk();
        blackSoyaMilk.make();
    }
}
