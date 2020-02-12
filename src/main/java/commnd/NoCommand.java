package commnd;

/**
 * Created by Kevin on 2020/2/10.
 *
 * @author Kevin
 */
public class NoCommand implements Command {

    private static final Command instance = new NoCommand();

    private NoCommand(){}

    public static Command getInstance(){
        return instance;
    }
    @Override
    public void execute() {
    }

    @Override
    public void undo() {
    }
}
