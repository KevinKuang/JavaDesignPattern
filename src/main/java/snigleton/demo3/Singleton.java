package snigleton.demo3;

/**
 * Created by Kevin on 2020/2/5.
 * 懒汉式（线程不安全）
 * @author Kevin
 */
public class Singleton {
    private String msg;
    private static Singleton INSTANCE;

    private Singleton(){}

    public static Singleton getInstance() {
        // 代码不具有原子性，执行if后可能会切出线程，造成单例模式被破坏
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
