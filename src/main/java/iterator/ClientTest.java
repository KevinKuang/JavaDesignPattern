package iterator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kevin on 2020/2/11.
 *
 * @author Kevin
 */
public class ClientTest {

    @Test
    public void test(){

        // 创建学院
        College computerCollege = new ComputerCollege();
        College communicationCollege = new CommunicationCollege();

        // 创建学院列表
        List<College> collegeList = new ArrayList<>();
        collegeList.add(computerCollege);
        collegeList.add(communicationCollege);


        computerCollege.addDepartment(new Department("JAVA"));
        computerCollege.addDepartment(new Department("PHP"));
        computerCollege.addDepartment(new Department("AI"));
        computerCollege.addDepartment(new Department("BTC"));

        communicationCollege.addDepartment(new Department("ee"));
        communicationCollege.addDepartment(new Department("ce"));
        communicationCollege.addDepartment(new Department("ie"));

        OutputImpl output = new OutputImpl(collegeList);
        output.printCollege();
    }
}
