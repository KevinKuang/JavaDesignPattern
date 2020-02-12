package proxy.gclibproxy;

import org.junit.Test;

/**
 * Created by Kevin on 2020/2/10.
 *
 * @author Kevin
 */
public class ClientTest {

    @Test
    public void test(){
        TeacherImpl teacher = new TeacherImpl();
        teacher.teach();

        TeacherProxyFactory factory = new TeacherProxyFactory(teacher);
        TeacherImpl proxy = factory.getProxy();
        proxy.teach();
    }

}
