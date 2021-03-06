package prototype.deepcopy.serialize;

import java.io.*;

/**
 * Created by Kevin on 2020/2/6.
 *
 * @author Kevin
 */
public class Sheep implements Serializable, Cloneable {
    private String name;
    private Integer age;
    private String color;

    // 两个引用类型

    private Sheep friend;
    private Person master;

    public Sheep(String name, Integer age, String color, Person master) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.master = master;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    public Person getMaster() {
        return master;
    }

    public void setMaster(Person master) {
        this.master = master;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", friend=" + friend +
                ", master=" + master +
                '}';
    }

    @Override
    protected Sheep clone(){

        return (Sheep) SerializeTool.serializeClone(this);
    }
}
