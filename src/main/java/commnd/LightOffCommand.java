package commnd;

/**
 * Created by Kevin on 2020/2/10.
 *
 * @author Kevin
 */
public class LightOffCommand implements LightCommand {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
