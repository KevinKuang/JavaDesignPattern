package adapter.interfaceadapter;

/**
 * Created by Kevin on 2020/2/8.
 *
 * @author Kevin
 */
public class RealListener extends ListenerAdapter implements Listener {
    @Override
    public void start() {
        System.out.println("动画开始了");
    }
}
