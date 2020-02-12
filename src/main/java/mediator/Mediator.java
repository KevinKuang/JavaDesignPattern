package mediator;

import java.util.Map;

/**
 * Created by Kevin on 2020/2/12.
 *
 * @author Kevin
 */
public abstract class Mediator {

    public abstract void register(String name,Colleague colleague);

    public abstract void getMsg(int changeState, String name);

    public abstract void sendMsg();
}
