package iterator;

import java.util.Iterator;

/**
 * Created by Kevin on 2020/2/11.
 *
 * @author Kevin
 */
public class ComputerCollegeIterator implements Iterator {

    private Department[] departments;
    private int position = -1;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        return (position+1)<departments.length&&departments[(position+1)]!=null;
    }

    @Override
    public Object next() {
        return departments[++position];
    }

    // 默认空实现
    @Override
    public void remove() {

    }
}
