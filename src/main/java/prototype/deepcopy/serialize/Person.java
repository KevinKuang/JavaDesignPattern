package prototype.deepcopy.serialize;

import java.io.Serializable;

/**
 * Created by Kevin on 2020/2/6.
 *
 * @author Kevin
 */
public class Person implements Serializable {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected Person clone(){
        return (Person)SerializeTool.serializeClone(this);
    }
}
