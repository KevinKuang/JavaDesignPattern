package prototype.deepcopy.clone;

/**
 * Created by Kevin on 2020/2/6.
 *
 * @author Kevin
 */
public class Person implements Cloneable {
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
    protected Person clone() {
        Person clone = null;
        try{
            clone = (Person)super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return clone;
    }
}
