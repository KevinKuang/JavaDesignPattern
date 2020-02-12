package composite.org;

/**
 * Created by Kevin on 2020/2/8.
 *
 * @author Kevin
 */
public abstract class Organization {
    protected String name;

    public Organization(String name) {
        this.name = name;
    }

    public abstract void add(Organization organization);

    public abstract void remove(Organization organization);

    public abstract void print();
}
