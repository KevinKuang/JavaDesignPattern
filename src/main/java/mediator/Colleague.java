package mediator;

/**
 * Created by Kevin on 2020/2/12.
 *
 * @author Kevin
 */
public abstract class Colleague {
    private Mediator mediator;
    protected String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public abstract void sendMsg(int stateChange);
}
