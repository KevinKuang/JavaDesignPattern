package composite.org;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kevin on 2020/2/8.
 *
 * @author Kevin
 */
public class College extends Organization {

    List<Organization> organizations = new ArrayList<>();


    public College(String name) {
        super(name);
    }

    @Override
    public void add(Organization organization) {
        this.organizations.add(organization);
    }

    @Override
    public void remove(Organization organization) {
        this.organizations.remove(organization);
    }

    @Override
    public void print() {
        System.out.println(String.format("===%s===",super.name));
        for (Organization org :
                organizations) {
            org.print();
        }
    }
}
