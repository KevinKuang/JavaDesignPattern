package mediator;

/**
 * Created by Kevin on 2020/2/12.
 *
 * @author Kevin
 */
public class Curtain extends Colleague {


    public Curtain(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name,this);
    }

    @Override
    public void sendMsg(int stateChange) {
        this.getMediator().getMsg(stateChange,this.name);
    }

    public void down(){
        System.out.println(name+"窗帘落下...");
    }
}
