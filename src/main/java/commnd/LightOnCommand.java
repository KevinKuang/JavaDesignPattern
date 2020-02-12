package commnd;

/**
 * Created by Kevin on 2020/2/10.
 *
 * @author Kevin
 */
public class LightOnCommand implements LightCommand {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
    }

    @Override
    public void undo() {
        this.light.off();
    }
}
