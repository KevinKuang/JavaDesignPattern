package facade;

import org.junit.Test;

/**
 * Created by Kevin on 2020/2/9.
 *
 * @author Kevin
 */
public class ClientTest {
    @Test
    public void test(){
        FamilyTheater familyTheater = new FamilyTheater();
        familyTheater.ready();
        familyTheater.play();
        familyTheater.end();
    }
}
