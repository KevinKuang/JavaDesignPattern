package proxy.stacticproxy;

import org.junit.Test;

/**
 * Created by Kevin on 2020/2/9.
 *
 * @author Kevin
 */
public class ClientTest {

    @Test
    public void test(){
        Teacher teacher = new TeacherImpl();
        teacher.teach();

        Teacher proxyTeacher =new ProxyTeacherImpl(teacher);
        proxyTeacher.teach();
    }
}
