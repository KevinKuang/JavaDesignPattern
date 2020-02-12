package prototype.deepcopy.json;

import java.io.Serializable;

/**
 * Created by Kevin on 2020/2/6.
 *
 * @author Kevin
 */
public class Person implements Cloneable,Serializable {
    private String name;

    public Person() {}

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
