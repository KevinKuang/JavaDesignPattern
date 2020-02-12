package iterator;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Kevin on 2020/2/11.
 *
 * @author Kevin
 */
public class CommunicationCollegeIterator implements Iterator {

    List<Department> departments;
    int index = -1;

    public CommunicationCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        return (index+1)<departments.size();
    }

    @Override
    public Object next() {
        return departments.get(++index);
    }

    // 默认空实现
    @Override
    public void remove() {

    }
}
