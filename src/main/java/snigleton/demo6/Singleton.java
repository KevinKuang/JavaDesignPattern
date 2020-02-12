package snigleton.demo6;

/**
 * Created by Kevin on 2020/2/5.
 * 静态内部类
 * @author Kevin
 */
public class Singleton {
    private String msg;

    private static class Instance{
        private static final Singleton INSTANCE = new Singleton();
    }

    private Singleton(){}

    public static Singleton getInstance() {
        return Instance.INSTANCE;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
