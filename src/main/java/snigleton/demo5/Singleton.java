package snigleton.demo5;

/**
 * Created by Kevin on 2020/2/5.
 * 双重检查
 * @author Kevin
 */
public class Singleton {
    private String msg;
    private static volatile Singleton INSTANCE;

    private Singleton(){}

    public static Singleton getInstance() {
        // 方法
        if (INSTANCE == null) {
            // 多个线程在此等待
            synchronized (Singleton.class) {
                // 单线程进入此代码块
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
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
