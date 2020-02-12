package iterator;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Kevin on 2020/2/11.
 *
 * @author Kevin
 */
public class OutputImpl {

    private List<College> collegeList;


    public OutputImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    public void printCollege(){
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()){
            College college = iterator.next();
            System.out.println(String.format("=======%s========",college.getName()));
            printDepartment(college.createIterator());
        }
    }

    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department department = (Department)iterator.next();
            System.out.println(department.getName());
        }
    }
}
