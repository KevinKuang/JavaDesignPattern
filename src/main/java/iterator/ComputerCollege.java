package iterator;

import java.util.Iterator;

/**
 * Created by Kevin on 2020/2/11.
 *
 * @author Kevin
 */
public class ComputerCollege implements College {

    private Department[] departments = new Department[10];
    private int numOfDepartments = 0;

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(Department department) {
        departments[numOfDepartments++]=department;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
