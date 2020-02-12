package prototype.tradition;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kevin on 2020/2/6.
 *
 * @author Kevin
 */
public class Test {
    public static void main(String[] args) {
        Sheep tom = new Sheep("Tom",1,"白色");
        List<Sheep> sheepList = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            Sheep clone = new Sheep(tom.getName(),tom.getAge(),tom.getColor());
            sheepList.add(clone);
        }

        //干扰
        sheepList.get(2).setAge(2);
        sheepList.get(5).setName("Bob");
        sheepList.get(9).setColor("黑色");
        //干扰结束

        for (int i = 0; i < 10; i++) {
            Sheep sheep = sheepList.get(i);
            System.out.println(String.format("==第%2d只羊========================", i));
            System.out.println("sheep = " + sheep);
            System.out.println("sheep.hashCode() = " + sheep.hashCode());
        }
    }
}
