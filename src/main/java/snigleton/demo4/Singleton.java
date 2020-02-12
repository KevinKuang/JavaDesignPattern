package snigleton.demo4;

/**
 * Created by Kevin on 2020/2/5.
 * 懒汉式（线程安全）
 * @author Kevin
 */
public class Singleton {
    private String msg;
    private static Singleton INSTANCE;

    private Singleton(){}

    public static synchronized Singleton getInstance() {
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