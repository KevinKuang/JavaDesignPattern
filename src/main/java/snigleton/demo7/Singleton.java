package snigleton.demo7;

/**
 * Created by Kevin on 2020/2/5.
 *
 * @author Kevin
 */
public enum Singleton {
    INSTANCE;
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }

}
