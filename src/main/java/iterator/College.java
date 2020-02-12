package iterator;

import java.util.Iterator;

/**
 * Created by Kevin on 2020/2/11.
 *
 * @author Kevin
 */
public interface College {

    String getName();

    void addDepartment(Department department);

    Iterator createIterator();
}
