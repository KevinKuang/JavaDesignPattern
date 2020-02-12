package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Kevin on 2020/2/11.
 *
 * @author Kevin
 */
public class CommunicationCollege implements College {

    List<Department> departments = new ArrayList<>();

    @Override
    public String getName() {
        return "通信学院";
    }

    @Override
    public void addDepartment(Department department) {
        departments.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new CommunicationCollegeIterator(departments);
    }
}
