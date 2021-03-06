package snigleton.demo2;

/**
 * Created by Kevin on 2020/2/5.
 * 饿汉式（静态代码块）
 * @author Kevin
 */
public class Singleton {
    private String msg;
    private final static Singleton INSTANCE;

    static {
        INSTANCE = new Singleton();
    }

    private Singleton(){}

    public static Singleton getInstance() {
        return INSTANCE;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
