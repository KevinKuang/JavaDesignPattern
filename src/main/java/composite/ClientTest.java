package composite;

import composite.org.College;
import composite.org.Department;
import composite.org.University;
import org.junit.Test;

/**
 * Created by Kevin on 2020/2/8.
 *
 * @author Kevin
 */
public class ClientTest {
    @Test
    public void test(){
        Department ai = new Department("人工智能");
        Department cs = new Department("计算机科学");
        Department ee = new Department("电子信息工程");
        Department ce = new Department("通信工程");
        College tx = new College("通信学院");
        College jsj = new College("计算机学院");
        University uni = new University("某大学");

        uni.add(tx);
        uni.add(jsj);

        tx.add(ee);
        tx.add(ce);
        jsj.add(ai);
        jsj.add(cs);

        uni.print();


    }
}
