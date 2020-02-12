package mediator;

/**
 * Created by Kevin on 2020/2/12.
 *
 * @author Kevin
 */
public class TV extends Colleague {
    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name,this);
    }

    @Override
    public void sendMsg(int stateChange) {
        this.getMediator().getMsg(stateChange,this.name);
    }

    public void on(){
        System.out.println(name+"电视机打开...");
    }
}
