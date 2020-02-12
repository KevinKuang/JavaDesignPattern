package composite.org;

/**
 * Created by Kevin on 2020/2/8.
 *
 * @author Kevin
 */
public class Department extends Organization {

    public Department(String name) {
        super(name);
    }

    @Override
    public void add(Organization organization) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Organization organization) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void print() {
        System.out.println(super.name);
    }
}
