package mediator;

/**
 * Created by Kevin on 2020/2/12.
 *
 * @author Kevin
 */
public class Alarm extends Colleague {
    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name,this);
    }

    public void ring(int stateChange){
        sendMsg(stateChange);
    }

    @Override
    public void sendMsg(int stateChange) {
        this.getMediator().getMsg(stateChange,this.name);
    }
}
