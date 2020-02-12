package prototype.construct;

/**
 * Created by Kevin on 2020/2/6.
 *
 * @author Kevin
 */
public class Sheep {
    private String name;
    private Integer age;
    private String color;

    Sheep(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    Sheep(Sheep old){
        this.name = old.name;
        this.age = old.age;
        this.color = old.color;
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

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
