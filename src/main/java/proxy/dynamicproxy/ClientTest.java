package proxy.dynamicproxy;

import org.junit.Test;

/**
 * Created by Kevin on 2020/2/10.
 *
 * @author Kevin
 */
public class ClientTest {

    @Test
    public void test(){
        Teacher teacher = new TeacherImpl();
        teacher.teach();

        TeacherProxyFactory factory = new TeacherProxyFactory(teacher);
        Teacher proxy = factory.getProxy();
        proxy.teach();

    }
}
