package prototype.deepcopy.json;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kevin on 2020/2/6.
 *
 * @author Kevin
 */
public class Test {
    public static void main(String[] args) {
        Person master = new Person("Jack");
        Sheep friend = new Sheep("Nick Sheep", 2, "灰色", master);
        Sheep tom = new Sheep("Tom Sheep",1,"白色", master);
        tom.setFriend(friend);
        List<Sheep> sheepList = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            Sheep clone = tom.clone();
            sheepList.add(clone);
        }

        //干扰
        sheepList.get(0).getFriend().getMaster().setName("Nick");
        sheepList.get(2).setAge(2);
        sheepList.get(4).getFriend().setColor("棕色");
        sheepList.get(5).setName("Bob Sheep");
        sheepList.get(7).getMaster().setName("Sun");
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
