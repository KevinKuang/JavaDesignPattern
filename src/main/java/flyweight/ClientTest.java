package flyweight;

import org.junit.Test;

/**
 * Created by Kevin on 2020/2/9.
 *
 * @author Kevin
 */
public class ClientTest {
    @Test
    public void test(){
        User tom = new User("Tom");
        User bob = new User("Bob");
        User merry = new User("Merry");
        User kit = new User("Kit");

        ConcreteWebsiteFactory factory = new ConcreteWebsiteFactory();
        factory.getConcreteWebsiteCategory("bloke").use(tom);
        factory.getConcreteWebsiteCategory("news").use(bob);
        factory.getConcreteWebsiteCategory("bloke").use(merry);
        factory.getConcreteWebsiteCategory("news").use(kit);
    }
}
