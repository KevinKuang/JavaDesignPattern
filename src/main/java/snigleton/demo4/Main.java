package snigleton.demo4;

/**
 * Created by Kevin on 2020/2/5.
 *
 * @author Kevin
 */
public class Main {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println("(instance1==instance2) = " + (instance1 == instance2));
        System.out.println("instance1.hashCode() = " + instance1.hashCode());
        System.out.println("instance2.hashCode() = " + instance2.hashCode());
        instance1.setMsg("msg from 1");
        instance2.setMsg("msg from 2");
        System.out.println("instance1.getMsg() = " + instance1.getMsg());
        System.out.println("instance2.getMsg() = " + instance2.getMsg());
    }
}
